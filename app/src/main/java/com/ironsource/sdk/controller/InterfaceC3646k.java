package com.ironsource.sdk.controller;

import android.content.Context;
import android.content.Intent;
import com.ironsource.InterfaceC3134g;
import com.ironsource.InterfaceC3169h;
import kotlin.jvm.internal.OooOo;

/* renamed from: com.ironsource.sdk.controller.k */
/* loaded from: classes2.dex */
public interface InterfaceC3646k {

    /* renamed from: com.ironsource.sdk.controller.k$a */
    public static final class a implements InterfaceC3134g {
        @Override // com.ironsource.InterfaceC3134g
        /* renamed from: a */
        public Intent mo8846a() {
            return new Intent("android.intent.action.VIEW");
        }
    }

    /* renamed from: com.ironsource.sdk.controller.k$b */
    public static final class b implements InterfaceC3169h {
        @Override // com.ironsource.InterfaceC3169h
        /* renamed from: a */
        public Intent mo9025a(Context context) {
            OooOo.OooO0o0(context, "context");
            return new Intent(context, (Class<?>) OpenUrlActivity.class);
        }
    }
}
