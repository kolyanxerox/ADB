package com.applovin.impl.sdk.p005ad;

import androidx.core.util.Consumer;
import androidx.window.layout.WindowLayoutInfo;
import com.applovin.impl.C1026f5;
import io.flutter.embedding.android.FlutterView;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements Consumer {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15838OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f15839OooOo0o;

    public /* synthetic */ OooO00o(Object obj, int i) {
        this.f15838OooOo0O = i;
        this.f15839OooOo0o = obj;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        switch (this.f15838OooOo0O) {
            case 0:
                ((C1206a) this.f15839OooOo0o).m2483t((C1026f5) obj);
                break;
            case 1:
                AbstractC1207b.m2503a((String) this.f15839OooOo0o, (C1026f5) obj);
                break;
            default:
                ((FlutterView) this.f15839OooOo0o).setWindowInfoListenerDisplayFeatures((WindowLayoutInfo) obj);
                break;
        }
    }
}
