
# 
## 保存用户
**URL:** http://localhost:8080/alreadyLogin/users

**Type:** POST

**Content-Type:** application/json; charset=utf-8


**Request-parameters:**

Parameter | Type|Description|Required
---|---|---|---
id|int|No comments found.|false
username|string|No comments found.|false
password|string|No comments found.|false
role|string|No comments found.|false
cardId|string|No comments found.|false
imagePath|string|No comments found.|false


**Request-example:**
```
{
	"id":393,
	"username":"志泽.于",
	"password":"f5kjk7",
	"role":"so0qel",
	"cardId":"rc6jam",
	"imagePath":"iqy6gx"
}
```
**Response-fields:**

Field | Type|Description
---|---|---
data|array|No comments found.
└─id|int|No comments found.
└─username|string|No comments found.
└─password|string|No comments found.
└─role|string|No comments found.
└─cardId|string|No comments found.
└─imagePath|string|No comments found.
code|string|No comments found.
message|string|No comments found.
user|object|No comments found.
└─id|int|No comments found.
└─username|string|No comments found.
└─password|string|No comments found.
└─role|string|No comments found.
└─cardId|string|No comments found.
└─imagePath|string|No comments found.


**Response-example:**
```
{
	"data":[
		{
			"id":330,
			"username":"志泽.于",
			"password":"hda28h",
			"role":"kdq0pp",
			"cardId":"bo0yh9",
			"imagePath":"wp4i3z"
		}
	],
	"code":"63996",
	"message":"success",
	"user":{
		"id":652,
		"username":"志泽.于",
		"password":"etys81",
		"role":"n7juvy",
		"cardId":"bcak1q",
		"imagePath":"pcxho2"
	}
}
```

## 获取某一用户的信息
**URL:** http://localhost:8080/alreadyLogin/users/{userId}

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded


**Request-parameters:**

Parameter | Type|Description|Required
---|---|---|---
userId|int|用户id|true


**Request-example:**
```
smart-doc currently cannot provide examples of parameters for the RequestParam request mode.
```
**Response-fields:**

Field | Type|Description
---|---|---
data|array|No comments found.
└─id|int|No comments found.
└─username|string|No comments found.
└─password|string|No comments found.
└─role|string|No comments found.
└─cardId|string|No comments found.
└─imagePath|string|No comments found.
code|string|No comments found.
message|string|No comments found.
user|object|No comments found.
└─id|int|No comments found.
└─username|string|No comments found.
└─password|string|No comments found.
└─role|string|No comments found.
└─cardId|string|No comments found.
└─imagePath|string|No comments found.


**Response-example:**
```
{
	"data":[
		{
			"id":868,
			"username":"志泽.于",
			"password":"39eb0c",
			"role":"zay4pm",
			"cardId":"j70mlq",
			"imagePath":"dwg0n4"
		}
	],
	"code":"63996",
	"message":"success",
	"user":{
		"id":234,
		"username":"志泽.于",
		"password":"x3e974",
		"role":"761udr",
		"cardId":"dolwg5",
		"imagePath":"3kjclj"
	}
}
```

## 获取不同角色的user列表
**URL:** http://localhost:8080/alreadyLogin/users

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded


**Request-parameters:**

Parameter | Type|Description|Required
---|---|---|---
role|string|角色|true


**Request-example:**
```
smart-doc currently cannot provide examples of parameters for the RequestParam request mode.
```
**Response-fields:**

Field | Type|Description
---|---|---
data|array|No comments found.
└─id|int|No comments found.
└─username|string|No comments found.
└─password|string|No comments found.
└─role|string|No comments found.
└─cardId|string|No comments found.
└─imagePath|string|No comments found.
code|string|No comments found.
message|string|No comments found.
user|object|No comments found.
└─id|int|No comments found.
└─username|string|No comments found.
└─password|string|No comments found.
└─role|string|No comments found.
└─cardId|string|No comments found.
└─imagePath|string|No comments found.


**Response-example:**
```
{
	"data":[
		{
			"id":411,
			"username":"志泽.于",
			"password":"ztew6o",
			"role":"leukne",
			"cardId":"kub709",
			"imagePath":"bdekda"
		}
	],
	"code":"63996",
	"message":"success",
	"user":{
		"id":842,
		"username":"志泽.于",
		"password":"eftk6v",
		"role":"rus82y",
		"cardId":"71rmag",
		"imagePath":"v5ds2g"
	}
}
```

## 删除用户，老师级联删除课程表和选课表，学生级联删除选课表
**URL:** http://localhost:8080/alreadyLogin/users/{userId}

**Type:** DELETE

**Content-Type:** application/x-www-form-urlencoded


**Request-parameters:**

Parameter | Type|Description|Required
---|---|---|---
userId|int|用户id|true


**Request-example:**
```
smart-doc currently cannot provide examples of parameters for the RequestParam request mode.
```
**Response-fields:**

Field | Type|Description
---|---|---
data|array|No comments found.
code|string|No comments found.
message|string|No comments found.
user|object|No comments found.
└─id|int|No comments found.
└─username|string|No comments found.
└─password|string|No comments found.
└─role|string|No comments found.
└─cardId|string|No comments found.
└─imagePath|string|No comments found.


**Response-example:**
```
{
	"data":[
		{
			"$ref":".."
		}
	],
	"code":"63996",
	"message":"success",
	"user":{
		"id":596,
		"username":"志泽.于",
		"password":"4xssrb",
		"role":"3s4mcn",
		"cardId":"ukww65",
		"imagePath":"246svc"
	}
}
```

## 更新用户的信息
**URL:** http://localhost:8080/alreadyLogin/users/{userId}

**Type:** PUT

**Content-Type:** application/json; charset=utf-8


**Request-parameters:**

Parameter | Type|Description|Required
---|---|---|---
id|int|No comments found.|false
username|string|No comments found.|false
password|string|No comments found.|false
role|string|No comments found.|false
cardId|string|No comments found.|false
imagePath|string|No comments found.|false


**Request-example:**
```
{
	"id":920,
	"username":"志泽.于",
	"password":"egq27m",
	"role":"lyg0nf",
	"cardId":"xog31b",
	"imagePath":"1gsrzy"
}
```
**Response-fields:**

Field | Type|Description
---|---|---
data|array|No comments found.
└─id|int|No comments found.
└─username|string|No comments found.
└─password|string|No comments found.
└─role|string|No comments found.
└─cardId|string|No comments found.
└─imagePath|string|No comments found.
code|string|No comments found.
message|string|No comments found.
user|object|No comments found.
└─id|int|No comments found.
└─username|string|No comments found.
└─password|string|No comments found.
└─role|string|No comments found.
└─cardId|string|No comments found.
└─imagePath|string|No comments found.


**Response-example:**
```
{
	"data":[
		{
			"id":884,
			"username":"志泽.于",
			"password":"u36197",
			"role":"09p6xk",
			"cardId":"6kybuu",
			"imagePath":"8as6lw"
		}
	],
	"code":"63996",
	"message":"success",
	"user":{
		"id":516,
		"username":"志泽.于",
		"password":"c1cqpm",
		"role":"43zijx",
		"cardId":"my6u1p",
		"imagePath":"m1abe7"
	}
}
```

