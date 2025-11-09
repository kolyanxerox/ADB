package com.unity3d.services.core.p012di;

import java.util.Map;
import o00O0o0o.o0ooOOo;
import oo00o.OooO0OO;

/* loaded from: classes3.dex */
public interface IServicesRegistry {

    public static final class DefaultImpls {
        public static /* synthetic */ Object getService$default(IServicesRegistry iServicesRegistry, String str, o0ooOOo o0ooooo, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getService");
            }
            if ((i & 1) != 0) {
                str = "";
            }
            return iServicesRegistry.getService(str, o0ooooo);
        }
    }

    <T> T getService(String str, o0ooOOo o0ooooo);

    Map<ServiceKey, OooO0OO> getServices();

    <T> T resolveService(ServiceKey serviceKey);

    <T> T resolveServiceOrNull(ServiceKey serviceKey);

    <T> void updateService(ServiceKey serviceKey, OooO0OO oooO0OO);
}
