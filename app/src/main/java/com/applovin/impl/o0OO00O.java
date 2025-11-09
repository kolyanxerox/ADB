package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.AbstractC1265v1;
import com.applovin.impl.C1059i8;
import com.applovin.impl.C1136n5;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class o0OO00O implements Runnable {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f15789OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ Object f15790OooOo0o;

    public /* synthetic */ o0OO00O(Object obj, int i) {
        this.f15789OooOo0O = i;
        this.f15790OooOo0o = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.f15789OooOo0O) {
            case 0:
                ((C1059i8.a) this.f15790OooOo0o).m1021b();
                break;
            case 1:
                ((C1136n5.c) this.f15790OooOo0o).m1898a();
                break;
            case 2:
                ((AbstractC1265v1.h) this.f15790OooOo0o).m3495a();
                break;
            case 3:
                ((C0959a6) this.f15790OooOo0o).m121e();
                break;
            case 4:
                ((C0992c1) this.f15790OooOo0o).notifyDataSetChanged();
                break;
            case 5:
                ((C0996c5) this.f15790OooOo0o).m479c();
                break;
            case 6:
                ((C1007d6) this.f15790OooOo0o).m611e();
                break;
            case 7:
                AbstractC1032g1.m774b((Context) this.f15790OooOo0o);
                break;
            case 8:
                ((C1059i8) this.f15790OooOo0o).m1008a();
                break;
            case 9:
                ((AbstractC1066j5) this.f15790OooOo0o).m1065i();
                break;
            case 10:
                ((C1084l3) this.f15790OooOo0o).notifyDataSetChanged();
                break;
            case 11:
                ((AbstractViewOnClickListenerC1152p2) this.f15790OooOo0o).notifyDataSetChanged();
                break;
            case 12:
                ((SharedPreferences.Editor) this.f15790OooOo0o).commit();
                break;
            default:
                ((C0952a) this.f15790OooOo0o).m65b();
                break;
        }
    }
}
