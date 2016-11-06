# UsercontrollerApi

All URIs are relative to *https://localhost:8081/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUserListUsingGET**](UsercontrollerApi.md#getUserListUsingGET) | **GET** /users | 获取用户列表
[**getUserUsingGET**](UsercontrollerApi.md#getUserUsingGET) | **GET** /users/{id} | 获取用户详细信息


<a name="getUserListUsingGET"></a>
# **getUserListUsingGET**
> ResponseListUser getUserListUsingGET()

获取用户列表

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsercontrollerApi;


UsercontrollerApi apiInstance = new UsercontrollerApi();
try {
    ResponseListUser result = apiInstance.getUserListUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsercontrollerApi#getUserListUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseListUser**](ResponseListUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserUsingGET"></a>
# **getUserUsingGET**
> ResponseUser getUserUsingGET(id)

获取用户详细信息

根据url的id来获取用户详细信息

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsercontrollerApi;


UsercontrollerApi apiInstance = new UsercontrollerApi();
String id = "id_example"; // String | 用户ID
try {
    ResponseUser result = apiInstance.getUserUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsercontrollerApi#getUserUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| 用户ID |

### Return type

[**ResponseUser**](ResponseUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

