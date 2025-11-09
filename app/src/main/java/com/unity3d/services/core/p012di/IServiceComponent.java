package com.unity3d.services.core.p012di;

/* loaded from: classes3.dex */
public interface IServiceComponent {

    public static final class DefaultImpls {
        public static IServiceProvider getServiceProvider(IServiceComponent iServiceComponent) {
            return ServiceProvider.INSTANCE;
        }
    }

    IServiceProvider getServiceProvider();
}
