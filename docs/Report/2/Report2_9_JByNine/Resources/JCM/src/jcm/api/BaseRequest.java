package jcm.api;

import jcm.constant.ERequestType;

public class BaseRequest implements IBaseRequestAction{
    protected String accessToken;
    protected String url;
    protected ERequestType requestType;

    @Override
    public String getRequest() {

        return null;
    }

    @Override
    public String postRequest() {
        return null;
    }

    public static final class BaseRequestBuilder {
        protected String accessToken;
        protected String url;
        protected ERequestType requestType;

        private BaseRequestBuilder() {
        }

        public static BaseRequestBuilder aBaseRequest() {
            return new BaseRequestBuilder();
        }

        public BaseRequestBuilder withAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public BaseRequestBuilder withUrl(String url) {
            this.url = url;
            return this;
        }

        public BaseRequestBuilder withRequestType(ERequestType requestType) {
            this.requestType = requestType;
            return this;
        }

        public BaseRequest build() {
            BaseRequest baseRequest = new BaseRequest();
            baseRequest.url = this.url;
            baseRequest.accessToken = this.accessToken;
            baseRequest.requestType = this.requestType;
            return baseRequest;
        }
    }
}
