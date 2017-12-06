#coding=utf-8
import json

# with open('followlist','rb') as f:
#     follows=json.loads(f.read().decode('utf-8'),encoding='utf-8')
#
with open('userlist','rb') as f:
    users=json.loads(f.read().decode('utf-8'),encoding='utf-8')

#users和follows时两个dict，可以根据id作为key访问到用户信息

#user是关注话题用户的列表，话题为NBA总决赛，user中包含以下子段："name":名称,"location"：地点,"screen_name"：显示名称,"gender"：性别,
#"star"：是否加星,"verified"：是否认证（true为认证）,"verified_type"：认证类型，"followers_count"：粉丝,"friends_count"：关注,"pagefriends_count"：不知道

#follows是关注话题的用户的关注列表，话题为NBA总决赛，通过follow[id]获得一个list，list中每一项为该用户关注用户的信息，包括
#"screen_name"：显示名称,"gender"：性别,"verified"：是否认证（true为认证）,"verified_type"：认证类型，"followers_count"：粉丝,"follow_count"：关注

with open('discuss','rb') as f:
    dicuss=json.loads(f.read().decode('utf-8'),encoding='utf-8')

with open('discussuser','rb') as f:
    dicussuser=json.loads(f.read().decode('utf-8'),encoding='utf-8')
#https://m.weibo.cn/api/comments/show?id=4116344650050183&page=23
#
u=1