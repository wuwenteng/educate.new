
# 
## 列出所有课程
**URL:** http://localhost:8080/alreadyLogin/courses

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded



**Request-example:**
```
No request parameters are required.
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
		"id":173,
		"username":"志泽.于",
		"password":"dyezd7",
		"role":"qzc6f1",
		"cardId":"5k1aas",
		"imagePath":"5toa00"
	}
}
```

## 某一教师的开课列表
**URL:** http://localhost:8080/alreadyLogin/teachers/{teacherId}/courses

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded


**Request-parameters:**

Parameter | Type|Description|Required
---|---|---|---
teacherId|int|教师id|true


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
		"id":805,
		"username":"志泽.于",
		"password":"anx487",
		"role":"o7njsn",
		"cardId":"f6jdcr",
		"imagePath":"c0kvon"
	}
}
```

## 保存课程
**URL:** http://localhost:8080/alreadyLogin/courses

**Type:** POST

**Content-Type:** application/json; charset=utf-8


**Request-parameters:**

Parameter | Type|Description|Required
---|---|---|---
id|int|No comments found.|false
name|string|No comments found.|false
code|string|No comments found.|false
time|string|No comments found.|false
place|string|No comments found.|false
teacherId|int|No comments found.|false


**Request-example:**
```
{
	"id":71,
	"name":"志泽.于",
	"code":"63996",
	"time":"2018-10-31 10:34:07",
	"place":"8pux4g",
	"teacherId":630
}
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
		"id":548,
		"username":"志泽.于",
		"password":"md7ef1",
		"role":"08ms5a",
		"cardId":"8pms27",
		"imagePath":"ol1lis"
	}
}
```

## 更新课程内容
**URL:** http://localhost:8080/alreadyLogin/courses/{courseId}

**Type:** PUT

**Content-Type:** application/json; charset=utf-8


**Request-parameters:**

Parameter | Type|Description|Required
---|---|---|---
id|int|No comments found.|false
name|string|No comments found.|false
code|string|No comments found.|false
time|string|No comments found.|false
place|string|No comments found.|false
teacherId|int|No comments found.|false


**Request-example:**
```
{
	"id":58,
	"name":"志泽.于",
	"code":"63996",
	"time":"2018-10-31 10:34:07",
	"place":"eyhicn",
	"teacherId":557
}
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
		"id":601,
		"username":"志泽.于",
		"password":"osb93e",
		"role":"jgfs4i",
		"cardId":"sfm1q5",
		"imagePath":"vz53qx"
	}
}
```

## 删除课程
**URL:** http://localhost:8080/alreadyLogin/courses/{courseId}

**Type:** DELETE

**Content-Type:** application/x-www-form-urlencoded


**Request-parameters:**

Parameter | Type|Description|Required
---|---|---|---
courseId|int|课程id|true


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
		"id":727,
		"username":"志泽.于",
		"password":"3z5gs7",
		"role":"l8le9y",
		"cardId":"6uohmi",
		"imagePath":"gdu9gd"
	}
}
```

