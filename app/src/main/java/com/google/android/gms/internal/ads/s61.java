package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* loaded from: classes2.dex */
public final class s61 extends ContentObserver {

    /* renamed from: OooO00o */
    public final ContentResolver f24020OooO00o;

    /* renamed from: OooO0O0 */
    public final Uri f24021OooO0O0;

    /* renamed from: OooO0OO */
    public final /* synthetic */ C1643hi f24022OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s61(C1643hi c1643hi, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f24022OooO0OO = c1643hi;
        this.f24020OooO00o = contentResolver;
        this.f24021OooO0O0 = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        C1643hi c1643hi = this.f24022OooO0OO;
        c1643hi.OooOO0(q61.OooO0O0((Context) c1643hi.f19786OooOo0O, (j50) c1643hi.f19793OooOooO, (pd0) c1643hi.f19791OooOoo));
    }
}
