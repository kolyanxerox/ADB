package com.google.android.gms.internal.ads;

import android.os.AsyncTask;
import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes2.dex */
public abstract class ai0 extends AsyncTask {

    /* renamed from: OooO00o */
    public bi0 f17047OooO00o;

    /* renamed from: OooO0O0 */
    public final C1548ey f17048OooO0O0;

    public ai0(C1548ey c1548ey) {
        this.f17048OooO0O0 = c1548ey;
    }

    @Override // android.os.AsyncTask
    /* renamed from: OooO00o */
    public void onPostExecute(String str) {
        bi0 bi0Var = this.f17047OooO00o;
        if (bi0Var != null) {
            bi0Var.f17510OooOoO0 = null;
            ai0 ai0Var = (ai0) ((ArrayDeque) bi0Var.f17507OooOo).poll();
            bi0Var.f17510OooOoO0 = ai0Var;
            if (ai0Var != null) {
                ai0Var.executeOnExecutor((ThreadPoolExecutor) bi0Var.f17509OooOo0o, new Object[0]);
            }
        }
    }
}
