package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;

/* renamed from: com.ironsource.z9 */
/* loaded from: classes2.dex */
public final class C3897z9 implements InterfaceC3327li, InterfaceC3292ki {

    /* renamed from: a */
    private final InterfaceC3732uf f12938a;

    public C3897z9() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.InterfaceC3327li
    /* renamed from: a */
    public String mo9786a(Context context, EnumC3863y9 source, String key) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(source, "source");
        kotlin.jvm.internal.OooOo.OooO0o0(key, "key");
        InterfaceC3070ea interfaceC3070eaMo8106a = this.f12938a.mo8106a(context, source);
        if (interfaceC3070eaMo8106a != null) {
            return InterfaceC3070ea.m8459a(interfaceC3070eaMo8106a, key, null, 2, null);
        }
        IronLog.INTERNAL.error("Shared storage does not exist for source: " + source);
        return null;
    }

    public C3897z9(InterfaceC3732uf sharedSignalsStorageFactory) {
        kotlin.jvm.internal.OooOo.OooO0o0(sharedSignalsStorageFactory, "sharedSignalsStorageFactory");
        this.f12938a = sharedSignalsStorageFactory;
    }

    @Override // com.ironsource.InterfaceC3292ki
    /* renamed from: a */
    public void mo9676a(Context context, EnumC3863y9 source, String key, String value) {
        oo00o.OooOo oooOo;
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(source, "source");
        kotlin.jvm.internal.OooOo.OooO0o0(key, "key");
        kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
        InterfaceC3070ea interfaceC3070eaMo8106a = this.f12938a.mo8106a(context, source);
        if (interfaceC3070eaMo8106a != null) {
            interfaceC3070eaMo8106a.mo7898a(key, value);
            oooOo = oo00o.OooOo.f33195OooO00o;
        } else {
            oooOo = null;
        }
        if (oooOo == null) {
            IronLog.INTERNAL.error("Shared storage does not exist for source: " + source);
        }
    }

    public /* synthetic */ C3897z9(InterfaceC3732uf interfaceC3732uf, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this((i & 1) != 0 ? new C3000ca() : interfaceC3732uf);
    }
}
