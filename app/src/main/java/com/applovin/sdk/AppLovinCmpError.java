package com.applovin.sdk;

/* loaded from: classes.dex */
public interface AppLovinCmpError {

    public enum Code {
        UNSPECIFIED(-1),
        INTEGRATION_ERROR(1),
        FORM_UNAVAILABLE(2),
        FORM_NOT_REQUIRED(3);


        /* renamed from: a */
        private final int f3346a;

        Code(int i) {
            this.f3346a = i;
        }

        public int getValue() {
            return this.f3346a;
        }
    }

    int getCmpCode();

    String getCmpMessage();

    Code getCode();

    String getMessage();
}
