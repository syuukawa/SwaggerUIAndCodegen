# UsercontrollerApi

All URIs are relative to *https://localhost:8081/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postUserUsingPOST**](UsercontrollerApi.md#postUserUsingPOST) | **POST** /users | 创建用户


<a name="postUserUsingPOST"></a>
# **postUserUsingPOST**
> String postUserUsingPOST(user)

创建用户

根据User对象创建用户

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsercontrollerApi;


UsercontrollerApi apiInstance = new UsercontrollerApi();
User user = new User(); // User | 用户详细实体user
try {
    String result = apiInstance.postUserUsingPOST(user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsercontrollerApi#postUserUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**User**](User.md)| 用户详细实体user |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: *_/_*

