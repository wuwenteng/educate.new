
# 
## 查找所有选课记录
**URL:** http://localhost:8080/alreadyLogin/studentCourses

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
		"id":725,
		"username":"志泽.于",
		"password":"1ykd82",
		"role":"07uaz8",
		"cardId":"ri71wn",
		"imagePath":"ljegn0"
	}
}
```

## 查找某一学生的选课记录
**URL:** http://localhost:8080/alreadyLogin/students/{studentId}/studentCourses

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded


**Request-parameters:**

Parameter | Type|Description|Required
---|---|---|---
studentId|int|学生id|true


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
		"id":842,
		"username":"志泽.于",
		"password":"ogpjrl",
		"role":"5n5lw0",
		"cardId":"t1h6zu",
		"imagePath":"zfkw00"
	}
}
```

## 获取选择某一课程的学生选课列表
**URL:** http://localhost:8080/alreadyLogin/courses/{courseId}/studentCourses

**Type:** GET

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
		"id":518,
		"username":"志泽.于",
		"password":"hezmoe",
		"role":"oo0oi9",
		"cardId":"w5m895",
		"imagePath":"vs6t0q"
	}
}
```

## 保存选课记录
**URL:** http://localhost:8080/alreadyLogin/studentCourses

**Type:** POST

**Content-Type:** application/json; charset=utf-8


**Request-parameters:**

Parameter | Type|Description|Required
---|---|---|---
id|int|No comments found.|false
score|int|No comments found.|false
studentId|int|No comments found.|false
courseId|int|No comments found.|false


**Request-example:**
```
{
	"id":326,
	"score":38,
	"studentId":253,
	"courseId":526
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
		"id":266,
		"username":"志泽.于",
		"password":"u6naqy",
		"role":"fc9gfi",
		"cardId":"o4s4i9",
		"imagePath":"oz0lrt"
	}
}
```

## 删除一条记录
**URL:** http://localhost:8080/alreadyLogin/studentCourses/{id}

**Type:** DELETE

**Content-Type:** application/x-www-form-urlencoded


**Request-parameters:**

Parameter | Type|Description|Required
---|---|---|---
id|int|记录id|true


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
		"id":229,
		"username":"志泽.于",
		"password":"f7f8bl",
		"role":"1f3k35",
		"cardId":"h67rwd",
		"imagePath":"1gby08"
	}
}
```

## 更新
**URL:** http://localhost:8080/alreadyLogin/studentCourses/{id}

**Type:** PUT

**Content-Type:** application/x-www-form-urlencoded


**Request-parameters:**

Parameter | Type|Description|Required
---|---|---|---
id|int|No comments found.|false
score|int|No comments found.|false
studentId|int|No comments found.|false
courseId|int|No comments found.|false


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
		"id":946,
		"username":"志泽.于",
		"password":"r48mk6",
		"role":"m40127",
		"cardId":"x8nejx",
		"imagePath":"38txd3"
	}
}
```

