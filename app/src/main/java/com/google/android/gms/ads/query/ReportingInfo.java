package com.google.android.gms.ads.query;

import Oooo0o.OooO0OO;
import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.BinderC1423bi;
import com.google.android.gms.internal.ads.BinderC1459ci;
import com.google.android.gms.internal.ads.C2249xx;
import com.google.android.gms.internal.ads.InterfaceC1499dl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes2.dex */
public final class ReportingInfo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final C2249xx f16660OooO00o;

    @Deprecated
    public static final class Builder {

        /* renamed from: OooO00o, reason: collision with root package name */
        public final C2249xx f16661OooO00o;

        @Deprecated
        public Builder(@NonNull View view) {
            C2249xx c2249xx = new C2249xx(17);
            this.f16661OooO00o = c2249xx;
            c2249xx.f25815OooOo0o = view;
        }

        @NonNull
        @Deprecated
        public ReportingInfo build() {
            return new ReportingInfo(this);
        }

        @NonNull
        @Deprecated
        public Builder setAssetViews(@NonNull Map<String, View> map) {
            HashMap map2 = (HashMap) this.f16661OooO00o.f25813OooOo;
            map2.clear();
            for (Map.Entry<String, View> entry : map.entrySet()) {
                View value = entry.getValue();
                if (value != null) {
                    map2.put(entry.getKey(), new WeakReference(value));
                }
            }
            return this;
        }
    }

    public /* synthetic */ ReportingInfo(Builder builder) {
        this.f16660OooO00o = new C2249xx(builder.f16661OooO00o);
    }

    @Deprecated
    public void recordClick(@NonNull List<Uri> list) {
        C2249xx c2249xx = this.f16660OooO00o;
        c2249xx.getClass();
        if (list == null || list.isEmpty()) {
            zzo.zzj("No click urls were passed to recordClick");
            return;
        }
        InterfaceC1499dl interfaceC1499dl = (InterfaceC1499dl) c2249xx.f25813OooOo;
        if (interfaceC1499dl == null) {
            zzo.zzj("Failed to get internal reporting info generator in recordClick.");
        }
        try {
            interfaceC1499dl.zzh(list, new OooO0OO((View) c2249xx.f25815OooOo0o), new BinderC1459ci(list, 1));
        } catch (RemoteException e) {
            zzo.zzg("RemoteException recording click: ".concat(e.toString()));
        }
    }

    @Deprecated
    public void recordImpression(@NonNull List<Uri> list) {
        C2249xx c2249xx = this.f16660OooO00o;
        c2249xx.getClass();
        if (list == null || list.isEmpty()) {
            zzo.zzj("No impression urls were passed to recordImpression");
            return;
        }
        InterfaceC1499dl interfaceC1499dl = (InterfaceC1499dl) c2249xx.f25813OooOo;
        if (interfaceC1499dl == null) {
            zzo.zzj("Failed to get internal reporting info generator from recordImpression.");
            return;
        }
        try {
            interfaceC1499dl.zzi(list, new OooO0OO((View) c2249xx.f25815OooOo0o), new BinderC1459ci(list, 0));
        } catch (RemoteException e) {
            zzo.zzg("RemoteException recording impression urls: ".concat(e.toString()));
        }
    }

    @Deprecated
    public void reportTouchEvent(@NonNull MotionEvent motionEvent) {
        InterfaceC1499dl interfaceC1499dl = (InterfaceC1499dl) this.f16660OooO00o.f25813OooOo;
        if (interfaceC1499dl == null) {
            zzo.zze("Failed to get internal reporting info generator.");
            return;
        }
        try {
            interfaceC1499dl.zzk(new OooO0OO(motionEvent));
        } catch (RemoteException unused) {
            zzo.zzg("Failed to call remote method.");
        }
    }

    @Deprecated
    public void updateClickUrl(@NonNull Uri uri, @NonNull UpdateClickUrlCallback updateClickUrlCallback) {
        C2249xx c2249xx = this.f16660OooO00o;
        InterfaceC1499dl interfaceC1499dl = (InterfaceC1499dl) c2249xx.f25813OooOo;
        if (interfaceC1499dl == null) {
            updateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            interfaceC1499dl.zzl(new ArrayList(Arrays.asList(uri)), new OooO0OO((View) c2249xx.f25815OooOo0o), new BinderC1423bi(updateClickUrlCallback, 1));
        } catch (RemoteException e) {
            updateClickUrlCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }

    @Deprecated
    public void updateImpressionUrls(@NonNull List<Uri> list, @NonNull UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        C2249xx c2249xx = this.f16660OooO00o;
        InterfaceC1499dl interfaceC1499dl = (InterfaceC1499dl) c2249xx.f25813OooOo;
        if (interfaceC1499dl == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            interfaceC1499dl.zzm(list, new OooO0OO((View) c2249xx.f25815OooOo0o), new BinderC1423bi(updateImpressionUrlsCallback, 0));
        } catch (RemoteException e) {
            updateImpressionUrlsCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }
}
