package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.bi */
/* loaded from: classes2.dex */
public final class BinderC1423bi extends AbstractBinderC2233xh {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f17505OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f17506OooOo0o;

    public /* synthetic */ BinderC1423bi(Object obj, int i) {
        this.f17505OooOo0O = i;
        this.f17506OooOo0o = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2270yh
    public final void Oooo000(List list) {
        switch (this.f17505OooOo0O) {
            case 0:
                ((UpdateImpressionUrlsCallback) this.f17506OooOo0o).onSuccess(list);
                break;
            default:
                ((UpdateClickUrlCallback) this.f17506OooOo0o).onSuccess((Uri) list.get(0));
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2270yh
    public final void zze(String str) {
        switch (this.f17505OooOo0O) {
            case 0:
                ((UpdateImpressionUrlsCallback) this.f17506OooOo0o).onFailure(str);
                break;
            default:
                ((UpdateClickUrlCallback) this.f17506OooOo0o).onFailure(str);
                break;
        }
    }
}
