package com.unity3d.services.core.p012di;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.OooOo;
import o00O0Oo.OooO0O0;
import o00O0o0o.o0ooOOo;
import oo00o.OooO0OO;

/* loaded from: classes3.dex */
public final class ServicesRegistry implements IServicesRegistry {
    private final ConcurrentHashMap<ServiceKey, OooO0OO> _services = new ConcurrentHashMap<>();

    public static ServiceKey factory$default(ServicesRegistry servicesRegistry, String named, OooO0O0 instance, int i, Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        OooOo.OooO0o0(named, "named");
        OooOo.OooO0o0(instance, "instance");
        OooOo.OooOO0O();
        throw null;
    }

    public static Object get$default(ServicesRegistry servicesRegistry, String named, int i, Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        OooOo.OooO0o0(named, "named");
        OooOo.OooOO0O();
        throw null;
    }

    public static Object getOrNull$default(ServicesRegistry servicesRegistry, String named, int i, Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        OooOo.OooO0o0(named, "named");
        OooOo.OooOO0O();
        throw null;
    }

    public static ServiceKey single$default(ServicesRegistry servicesRegistry, String named, OooO0O0 instance, int i, Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        OooOo.OooO0o0(named, "named");
        OooOo.OooO0o0(instance, "instance");
        OooOo.OooOO0O();
        throw null;
    }

    public final <T> ServiceKey factory(String named, OooO0O0 instance) {
        OooOo.OooO0o0(named, "named");
        OooOo.OooO0o0(instance, "instance");
        OooOo.OooOO0O();
        throw null;
    }

    public final <T> T get(String named) {
        OooOo.OooO0o0(named, "named");
        OooOo.OooOO0O();
        throw null;
    }

    public final <T> T getOrNull(String named) {
        OooOo.OooO0o0(named, "named");
        OooOo.OooOO0O();
        throw null;
    }

    @Override // com.unity3d.services.core.p012di.IServicesRegistry
    public <T> T getService(String named, o0ooOOo instance) {
        OooOo.OooO0o0(named, "named");
        OooOo.OooO0o0(instance, "instance");
        return (T) resolveService(new ServiceKey(named, instance));
    }

    @Override // com.unity3d.services.core.p012di.IServicesRegistry
    public Map<ServiceKey, OooO0OO> getServices() {
        return this._services;
    }

    @Override // com.unity3d.services.core.p012di.IServicesRegistry
    public <T> T resolveService(ServiceKey key) {
        OooOo.OooO0o0(key, "key");
        OooO0OO oooO0OO = getServices().get(key);
        if (oooO0OO != null) {
            return (T) oooO0OO.getValue();
        }
        throw new IllegalStateException("No service instance found for " + key);
    }

    @Override // com.unity3d.services.core.p012di.IServicesRegistry
    public <T> T resolveServiceOrNull(ServiceKey key) {
        OooOo.OooO0o0(key, "key");
        OooO0OO oooO0OO = getServices().get(key);
        if (oooO0OO == null) {
            return null;
        }
        return (T) oooO0OO.getValue();
    }

    public final <T> ServiceKey single(String named, OooO0O0 instance) {
        OooOo.OooO0o0(named, "named");
        OooOo.OooO0o0(instance, "instance");
        OooOo.OooOO0O();
        throw null;
    }

    @Override // com.unity3d.services.core.p012di.IServicesRegistry
    public <T> void updateService(ServiceKey key, OooO0OO instance) {
        OooOo.OooO0o0(key, "key");
        OooOo.OooO0o0(instance, "instance");
        if (!getServices().containsKey(key)) {
            this._services.put(key, instance);
        } else {
            throw new IllegalStateException(("Cannot have multiple identical services: " + key).toString());
        }
    }
}
