package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class mh0 {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final Pattern f21253OooO0O0 = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f21254OooO00o = new ArrayList();

    public final void OooO00o(View view, ah0 ah0Var) {
        lh0 lh0Var;
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
        if (!f21253OooO0O0.matcher("Ad overlay").matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        ArrayList arrayList = this.f21254OooO00o;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                lh0Var = null;
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            lh0Var = (lh0) obj;
            if (lh0Var.f20888OooO00o.get() == view) {
                break;
            }
        }
        if (lh0Var == null) {
            arrayList.add(new lh0(view, ah0Var));
        }
    }
}
