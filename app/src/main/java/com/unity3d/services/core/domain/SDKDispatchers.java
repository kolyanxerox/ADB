package com.unity3d.services.core.domain;

import o00O0oOo.o0000O00;
import o00O0oOo.o000O0O0;
import o00OO000.Oooo0;
import o00OO00o.OooO;
import o00OO00o.OooO0o;

/* loaded from: classes3.dex */
public final class SDKDispatchers implements ISDKDispatchers {

    /* renamed from: default, reason: not valid java name */
    private final o0000O00 f13245default;

    /* renamed from: io */
    private final o0000O00 f13193io;
    private final o0000O00 main;

    public SDKDispatchers() {
        OooO oooO = o000O0O0.f31514OooO00o;
        this.f13193io = OooO0o.f31999OooOo0O;
        this.f13245default = o000O0O0.f31514OooO00o;
        this.main = Oooo0.f31951OooO00o;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    public o0000O00 getDefault() {
        return this.f13245default;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    public o0000O00 getIo() {
        return this.f13193io;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    public o0000O00 getMain() {
        return this.main;
    }
}
