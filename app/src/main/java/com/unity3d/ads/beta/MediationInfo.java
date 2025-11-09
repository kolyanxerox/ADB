package com.unity3d.ads.beta;

import kotlin.jvm.internal.OooOo;

/* loaded from: classes2.dex */
public final class MediationInfo {
    private final String adapterVersion;
    private final String name;
    private final String version;

    public MediationInfo(String name, String version, String adapterVersion) {
        OooOo.OooO0o0(name, "name");
        OooOo.OooO0o0(version, "version");
        OooOo.OooO0o0(adapterVersion, "adapterVersion");
        this.name = name;
        this.version = version;
        this.adapterVersion = adapterVersion;
    }

    public final String getAdapterVersion() {
        return this.adapterVersion;
    }

    public final String getName() {
        return this.name;
    }

    public final String getVersion() {
        return this.version;
    }
}
