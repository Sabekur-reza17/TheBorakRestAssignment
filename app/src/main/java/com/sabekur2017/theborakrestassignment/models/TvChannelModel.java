package com.sabekur2017.theborakrestassignment.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TvChannelModel {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("auth")
    @Expose
    private Object auth;
    @SerializedName("events")
    @Expose
    private Object events;
    @SerializedName("variables")
    @Expose
    private List<Object> variables = null;
    @SerializedName("order")
    @Expose
    private List<String> order = null;
    @SerializedName("folders_order")
    @Expose
    private List<Object> foldersOrder = null;
    @SerializedName("protocolProfileBehavior")
    @Expose
    private List<Object> protocolProfileBehavior = null;
    @SerializedName("folders")
    @Expose
    private List<Object> folders = null;
    @SerializedName("requests")
    @Expose
    private List<Request> requests = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public Object getAuth() {
        return auth;
    }

    public void setAuth(Object auth) {
        this.auth = auth;
    }

    public Object getEvents() {
        return events;
    }

    public void setEvents(Object events) {
        this.events = events;
    }

    public List<Object> getVariables() {
        return variables;
    }

    public void setVariables(List<Object> variables) {
        this.variables = variables;
    }

    public List<String> getOrder() {
        return order;
    }

    public void setOrder(List<String> order) {
        this.order = order;
    }

    public List<Object> getFoldersOrder() {
        return foldersOrder;
    }

    public void setFoldersOrder(List<Object> foldersOrder) {
        this.foldersOrder = foldersOrder;
    }

    public List<Object> getProtocolProfileBehavior() {
        return protocolProfileBehavior;
    }

    public void setProtocolProfileBehavior(List<Object> protocolProfileBehavior) {
        this.protocolProfileBehavior = protocolProfileBehavior;
    }

    public List<Object> getFolders() {
        return folders;
    }

    public void setFolders(List<Object> folders) {
        this.folders = folders;
    }

    public List<Request> getRequests() {
        return requests;
    }

    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }
    public static class Request {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("description")
        @Expose
        private Object description;
        @SerializedName("data")
        @Expose
        private Object data;
        @SerializedName("dataOptions")
        @Expose
        private Object dataOptions;
        @SerializedName("dataMode")
        @Expose
        private Object dataMode;
        @SerializedName("headerData")
        @Expose
        private List<HeaderDatum> headerData = null;
        @SerializedName("method")
        @Expose
        private String method;
        @SerializedName("pathVariableData")
        @Expose
        private List<Object> pathVariableData = null;
        @SerializedName("queryParams")
        @Expose
        private List<QueryParam> queryParams = null;
        @SerializedName("auth")
        @Expose
        private Auth auth;
        @SerializedName("events")
        @Expose
        private Object events;
        @SerializedName("folder")
        @Expose
        private Object folder;
        @SerializedName("currentHelper")
        @Expose
        private String currentHelper;
        @SerializedName("helperAttributes")
        @Expose
        private HelperAttributes helperAttributes;
        @SerializedName("collectionId")
        @Expose
        private String collectionId;
        @SerializedName("headers")
        @Expose
        private String headers;
        @SerializedName("pathVariables")
        @Expose
        private List<Object> pathVariables = null;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Object getDescription() {
            return description;
        }

        public void setDescription(Object description) {
            this.description = description;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Object getDataOptions() {
            return dataOptions;
        }

        public void setDataOptions(Object dataOptions) {
            this.dataOptions = dataOptions;
        }

        public Object getDataMode() {
            return dataMode;
        }

        public void setDataMode(Object dataMode) {
            this.dataMode = dataMode;
        }

        public List<HeaderDatum> getHeaderData() {
            return headerData;
        }

        public void setHeaderData(List<HeaderDatum> headerData) {
            this.headerData = headerData;
        }

        public String getMethod() {
            return method;
        }

        public void setMethod(String method) {
            this.method = method;
        }

        public List<Object> getPathVariableData() {
            return pathVariableData;
        }

        public void setPathVariableData(List<Object> pathVariableData) {
            this.pathVariableData = pathVariableData;
        }

        public List<QueryParam> getQueryParams() {
            return queryParams;
        }

        public void setQueryParams(List<QueryParam> queryParams) {
            this.queryParams = queryParams;
        }

        public Auth getAuth() {
            return auth;
        }

        public void setAuth(Auth auth) {
            this.auth = auth;
        }

        public Object getEvents() {
            return events;
        }

        public void setEvents(Object events) {
            this.events = events;
        }

        public Object getFolder() {
            return folder;
        }

        public void setFolder(Object folder) {
            this.folder = folder;
        }

        public String getCurrentHelper() {
            return currentHelper;
        }

        public void setCurrentHelper(String currentHelper) {
            this.currentHelper = currentHelper;
        }

        public HelperAttributes getHelperAttributes() {
            return helperAttributes;
        }

        public void setHelperAttributes(HelperAttributes helperAttributes) {
            this.helperAttributes = helperAttributes;
        }

        public String getCollectionId() {
            return collectionId;
        }

        public void setCollectionId(String collectionId) {
            this.collectionId = collectionId;
        }

        public String getHeaders() {
            return headers;
        }

        public void setHeaders(String headers) {
            this.headers = headers;
        }

        public List<Object> getPathVariables() {
            return pathVariables;
        }

        public void setPathVariables(List<Object> pathVariables) {
            this.pathVariables = pathVariables;
        }

    }
    public static class QueryParam {

        @SerializedName("key")
        @Expose
        private String key;
        @SerializedName("value")
        @Expose
        private String value;
        @SerializedName("equals")
        @Expose
        private Boolean equals;
        @SerializedName("enabled")
        @Expose
        private Boolean enabled;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Boolean getEquals() {
            return equals;
        }

        public void setEquals(Boolean equals) {
            this.equals = equals;
        }

        public Boolean getEnabled() {
            return enabled;
        }

        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }

    }
    public static class HelperAttributes {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("token")
        @Expose
        private String token;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

    }
    public static class HeaderDatum {

        @SerializedName("key")
        @Expose
        private String key;
        @SerializedName("value")
        @Expose
        private String value;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("enabled")
        @Expose
        private Boolean enabled;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Boolean getEnabled() {
            return enabled;
        }

        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }

    }
    public static class Bearer {

        @SerializedName("key")
        @Expose
        private String key;
        @SerializedName("value")
        @Expose
        private String value;
        @SerializedName("type")
        @Expose
        private String type;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

    }
    public class Auth {

        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("bearer")
        @Expose
        private List<Bearer> bearer = null;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public List<Bearer> getBearer() {
            return bearer;
        }

        public void setBearer(List<Bearer> bearer) {
            this.bearer = bearer;
        }

    }
}
