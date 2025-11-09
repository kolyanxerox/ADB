package com.unity3d.services.core.properties;

/* loaded from: classes3.dex */
public interface Session {
    public static final Default Default = Default.$$INSTANCE;

    public static final class Default implements Session {
        static final /* synthetic */ Default $$INSTANCE = new Default();

        /* renamed from: id */
        private static final String f13196id = SessionIdReader.INSTANCE.getSessionId();

        private Default() {
        }

        @Override // com.unity3d.services.core.properties.Session
        public String getId() {
            return f13196id;
        }
    }

    String getId();
}
