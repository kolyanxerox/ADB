package com.applovin.impl;

import android.content.DialogInterface;
import android.net.Uri;

/* loaded from: classes.dex */
public final /* synthetic */ class o00000O implements DialogInterface.OnClickListener {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15707OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f15708OooOo0o;

    public /* synthetic */ o00000O(Object obj, int i) {
        this.f15707OooOo0O = i;
        this.f15708OooOo0o = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f15707OooOo0O) {
            case 0:
                ((C1094m3) this.f15708OooOo0o).m1480a(dialogInterface, i);
                break;
            default:
                C1246t0.m3274b((Uri) this.f15708OooOo0o, dialogInterface, i);
                break;
        }
    }
}
