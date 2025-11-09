package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceUtils;

/* renamed from: com.ironsource.lt */
/* loaded from: classes2.dex */
public final class C3342lt implements InterfaceC3153gi {
    @Override // com.ironsource.InterfaceC3153gi
    /* renamed from: a */
    public void mo8975a(Context context, String key, int i) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(key, "key");
        IronSourceUtils.saveIntToSharedPrefs(context, key, i);
    }

    @Override // com.ironsource.InterfaceC3153gi
    /* renamed from: b */
    public int mo8977b(Context context, String key, int i) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(key, "key");
        return IronSourceUtils.getIntFromSharedPrefs(context, key, i);
    }

    @Override // com.ironsource.InterfaceC3153gi
    /* renamed from: a */
    public void mo8976a(Context context, String key, long j) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(key, "key");
        IronSourceUtils.saveLongToSharedPrefs(context, key, j);
    }

    @Override // com.ironsource.InterfaceC3153gi
    /* renamed from: b */
    public long mo8978b(Context context, String key, long j) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(key, "key");
        return IronSourceUtils.getLongFromSharedPrefs(context, key, j);
    }
}
