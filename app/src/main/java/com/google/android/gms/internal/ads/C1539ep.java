package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import com.google.android.gms.ads.internal.util.zze;

/* renamed from: com.google.android.gms.internal.ads.ep */
/* loaded from: classes2.dex */
public final class C1539ep extends MutableContextWrapper {

    /* renamed from: OooO00o, reason: collision with root package name */
    public Activity f18639OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public Context f18640OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public Context f18641OooO0OO;

    public final void OooO00o(Intent intent) {
        if (this.f18639OooO00o == null) {
            intent.setFlags(268435456);
            this.f18640OooO0O0.startActivity(intent);
            return;
        }
        zze.zza("Starting activity for result with intent: " + String.valueOf(intent.getData()) + " and requestCode: 236");
        this.f18639OooO00o.startActivityForResult(intent, 236);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.f18641OooO0OO.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f18640OooO0O0 = applicationContext;
        this.f18639OooO00o = context instanceof Activity ? (Activity) context : null;
        this.f18641OooO0OO = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f18639OooO00o;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.f18640OooO0O0.startActivity(intent);
        }
    }
}
