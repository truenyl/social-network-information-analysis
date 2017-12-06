爬取话题为#NBA总决赛#
由于新浪微博限制，话题粉丝只能爬取500页，最终爬取了4952条记录
爬取了这4952个用户每个人的关注列表，由于新浪微博限制，最多只能爬取200个，少于200个的说明完全爬取

graph里是整理好的关注列表信息
userlist是话题粉丝的json文件
followlist是每个用户关注列表的json文件
discuss是讨论页的微博信息
discussuser是讨论页的用户信息
discussfollowlist是讨论页中用户的关注信息
discussgraph是整理好的讨论页中用户的关注列表
读取json请参见readjson.py里的代码和格式说明


另外，某个话题的粉丝之间不会相互关注，但是可能关注的人会有很多重叠（比如说某支球队），是不是可以对这个进行一些分析

下面是这次新添加的内容
comments是讨论页中微博的评论
transmits是讨论页中微博的转发
discuss_userid是对应微博id的用户id

格式说明：
comments是一个dict类型，key为微博的id，value为一个list包含了这条微博下的所有评论信息，list中每一项为一个dict，键值对含义如下：
"text":评论内容
"created_at":一个时间戳，代表1970纪元后经过的浮点秒数，即time.time()的输出类型，是评论发表的时间
"userid":发表这条评论的用户id
"screen_name":发表这条评论的用户名称
"verified":发表这条评论的用户是否认证
"like_counts":这条评论的赞数
"id":这条评论的id
"crawl_time":爬取这条评论的时间

transmits是一个dict类型，key为微博的id，value为一个list包含了这条微博下的所有转发信息，list中每一项为一个dict，键值对含义如下：
"text":转发内容
"created_at":一个时间戳，代表1970纪元后经过的浮点秒数，即time.time()的输出类型，是转发的时间
"userid":发表这条转发的用户id
"screen_name":发表这条转发的用户名称
"verified":发表这条转发的用户是否认证
"id":这条转发的id
"crawl_time":爬取这条转发的时间

discuss_userid是一个dict类型，key代表微博的id与comments/transmits中最外层的key一致，value代表用户的id