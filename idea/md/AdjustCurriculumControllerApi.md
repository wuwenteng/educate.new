
# 
## 查找某一条记录
**URL:** http://localhost:8080/alreadyLogin/adjustCurriculums/{id}

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded


**Request-parameters:**

Parameter | Type|Description|Required
---|---|---|---
id|int|记录得id|true


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
		"id":988,
		"username":"志泽.于",
		"password":"n61va0",
		"role":"g66h2d",
		"cardId":"524ra9",
		"imagePath":"3bblfi"
	}
}
```

## 查询某一学生的申请记录
**URL:** http://localhost:8080/alreadyLogin/students/{id}/adjustCurriculums

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded


**Request-parameters:**

Parameter | Type|Description|Required
---|---|---|---
id|int|学生id|true


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
		"id":17,
		"username":"志泽.于",
		"password":"gndrcf",
		"role":"w5widj",
		"cardId":"zg9q15",
		"imagePath":"ando9j"
	}
}
```

## 获取所有的申请记录
**URL:** http://localhost:8080/alreadyLogin/adjustCurriculums

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
		"id":280,
		"username":"志泽.于",
		"password":"frjt83",
		"role":"bslvtj",
		"cardId":"ysb97r",
		"imagePath":"9poq0b"
	}
}
```

## 新建一条申请记录
**URL:** http://localhost:8080/alreadyLogin/adjustCurriculums

**Type:** POST

**Content-Type:** application/json; charset=utf-8


**Request-parameters:**

Parameter | Type|Description|Required
---|---|---|---
id|int|No comments found.|false
beReplacedCourseId|int|No comments found.|false
beReplacedCourseName|string|No comments found.|false
replacedByCourseId|int|No comments found.|false
replacedByCourseName|string|No comments found.|false
status|string|No comments found.|false
reason|string|No comments found.|false
approvedBy|int|No comments found.|false
applicant|int|No comments found.|false


**Request-example:**
```
{
	"id":910,
	"beReplacedCourseId":259,
	"beReplacedCourseName":"志泽.于",
	"replacedByCourseId":788,
	"replacedByCourseName":"志泽.于",
	"status":"0rv7v9",
	"reason":"tzzkdv",
	"approvedBy":224,
	"applicant":764
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
		"id":217,
		"username":"志泽.于",
		"password":"nto9xj",
		"role":"rpj4t2",
		"cardId":"vocwku",
		"imagePath":"m55o1o"
	}
}
```

## 更新
**URL:** http://localhost:8080/alreadyLogin/adjustCurriculums/{id}

**Type:** PUT

**Content-Type:** application/json; charset=utf-8


**Request-parameters:**

Parameter | Type|Description|Required
---|---|---|---
id|int|No comments found.|false
beReplacedCourseId|int|No comments found.|false
beReplacedCourseName|string|No comments found.|false
replacedByCourseId|int|No comments found.|false
replacedByCourseName|string|No comments found.|false
status|string|No comments found.|false
reason|string|No comments found.|false
approvedBy|int|No comments found.|false
applicant|int|No comments found.|false


**Request-example:**
```
{
	"id":388,
	"beReplacedCourseId":178,
	"beReplacedCourseName":"志泽.于",
	"replacedByCourseId":617,
	"replacedByCourseName":"志泽.于",
	"status":"oz3eal",
	"reason":"q9okcf",
	"approvedBy":334,
	"applicant":865
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
		"id":578,
		"username":"志泽.于",
		"password":"mp0ztx",
		"role":"nsvqql",
		"cardId":"fujbv3",
		"imagePath":"6it9nn"
	}
}
```

## 删除
**URL:** http://localhost:8080/alreadyLogin/adjustCurriculums/{id}

**Type:** DELETE

**Content-Type:** application/x-www-form-urlencoded


**Request-parameters:**

Parameter | Type|Description|Required
---|---|---|---
id|int|要删除的记录的id|true


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
		"id":872,
		"username":"志泽.于",
		"password":"h0un2o",
		"role":"vzeeyb",
		"cardId":"utc9zp",
		"imagePath":"puicge"
	}
}
```

