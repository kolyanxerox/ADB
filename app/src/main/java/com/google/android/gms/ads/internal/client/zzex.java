package com.google.android.gms.ads.internal.client;

import OooO0oO.OooOo;
import Oooo00O.o000000O;
import Oooo0o.OooO0OO;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.C1898oe;
import com.google.android.gms.internal.ads.C2080tc;
import com.google.android.gms.internal.ads.C2302zc;
import com.google.android.gms.internal.ads.RunnableC1442c1;
import com.google.android.gms.internal.ads.wj0;
import com.ironsource.mediationsdk.metadata.C3401a;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class zzex {

    /* renamed from: OooOO0, reason: collision with root package name */
    public static zzex f16071OooOO0;
    public static final Set zza = new HashSet(Arrays.asList(AdFormat.APP_OPEN_AD, AdFormat.INTERSTITIAL, AdFormat.REWARDED));

    /* renamed from: OooO0oO, reason: collision with root package name */
    public zzcz f16079OooO0oO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Object f16073OooO00o = new Object();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Object f16074OooO0O0 = new Object();

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f16076OooO0Oo = false;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public boolean f16078OooO0o0 = false;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final Object f16077OooO0o = new Object();

    /* renamed from: OooO0oo, reason: collision with root package name */
    public OnAdInspectorClosedListener f16080OooO0oo = null;

    /* renamed from: OooO, reason: collision with root package name */
    public RequestConfiguration f16072OooO = new RequestConfiguration.Builder().build();

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList f16075OooO0OO = new ArrayList();

    public static wj0 OooO00o(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2080tc c2080tc = (C2080tc) it.next();
            map.put(c2080tc.zza, new C2302zc(c2080tc.zzb ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, c2080tc.zzd, c2080tc.zzc));
        }
        return new wj0(map, 6);
    }

    public static /* bridge */ /* synthetic */ Optional OooO0Oo(zzft zzftVar) {
        String str = zzftVar.zza;
        AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
        if (adFormat == null) {
            return Optional.empty();
        }
        zzm zzmVar = zzftVar.zzc;
        final AdRequest.Builder builder = new AdRequest.Builder();
        List list = zzmVar.zze;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                builder.addKeyword((String) it.next());
            }
        }
        builder.zzc(zzmVar.zzm);
        for (String str2 : zzmVar.zzn.keySet()) {
            builder.addCustomTargeting(str2, zzmVar.zzn.getString(str2));
        }
        builder.setAdString(zzmVar.zzx);
        Optional.ofNullable(zzmVar.zzl).ifPresent(new Consumer() { // from class: com.google.android.gms.ads.internal.client.zzq
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.setContentUrl((String) obj);
            }
        });
        builder.setNeighboringContentUrls(zzmVar.zzv);
        builder.setRequestAgent(zzmVar.zzp);
        AdRequest adRequestBuild = builder.build();
        PreloadConfiguration.Builder builder2 = new PreloadConfiguration.Builder(str, adFormat);
        builder2.setAdRequest(adRequestBuild);
        builder2.setBufferSize(zzftVar.zzd);
        return Optional.of(builder2.build());
    }

    public static zzex zzf() {
        zzex zzexVar;
        synchronized (zzex.class) {
            try {
                if (f16071OooOO0 == null) {
                    f16071OooOO0 = new zzex();
                }
                zzexVar = f16071OooOO0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzexVar;
    }

    public final void OooO0O0(Context context) {
        try {
            if (C1898oe.f22977OooO0O0 == null) {
                C1898oe.f22977OooO0O0 = new C1898oe(0);
            }
            String str = null;
            if (C1898oe.f22977OooO0O0.f22978OooO00o.compareAndSet(false, true)) {
                new Thread(new RunnableC1442c1(context, str)).start();
            }
            this.f16079OooO0oO.zzk();
            this.f16079OooO0oO.zzl(null, new OooO0OO(null));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("MobileAdsSettingManager initialization failed", e);
        }
    }

    public final void OooO0OO(Context context) {
        if (this.f16079OooO0oO == null) {
            this.f16079OooO0oO = (zzcz) new zzav(zzbc.zza(), context).zzd(context, false);
        }
    }

    public final float zza() {
        synchronized (this.f16077OooO0o) {
            zzcz zzczVar = this.f16079OooO0oO;
            float fZze = 1.0f;
            if (zzczVar == null) {
                return 1.0f;
            }
            try {
                fZze = zzczVar.zze();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to get app volume.", e);
            }
            return fZze;
        }
    }

    @NonNull
    public final RequestConfiguration zzc() {
        return this.f16072OooO;
    }

    public final InitializationStatus zze() {
        wj0 wj0VarOooO00o;
        synchronized (this.f16077OooO0o) {
            try {
                o000000O.OooOO0O(this.f16079OooO0oO != null, "MobileAds.initialize() must be called prior to getting initialization status.");
                try {
                    wj0VarOooO00o = OooO00o(this.f16079OooO0oO.zzg());
                } catch (RemoteException unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to get Initialization status.");
                    return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzem
                        @Override // com.google.android.gms.ads.initialization.InitializationStatus
                        public final Map getAdapterStatusMap() {
                            HashMap map = new HashMap();
                            map.put("com.google.android.gms.ads.MobileAds", new zzet());
                            return map;
                        }
                    };
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return wj0VarOooO00o;
    }

    public final Status zzg(@NonNull Context context, @NonNull List list, @NonNull PreloadCallback preloadCallback) {
        boolean z;
        Status status;
        int bufferSize;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PreloadConfiguration preloadConfiguration = (PreloadConfiguration) it.next();
            String strOooOoo = OooOo.OooOoo(String.valueOf(preloadConfiguration.getAdFormat()), "#", preloadConfiguration.getAdUnitId());
            map.put(strOooOoo, Integer.valueOf(((Integer) map.getOrDefault(strOooOoo, 0)).intValue() + 1));
        }
        Iterator it2 = map.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z = false;
                break;
            }
            if (((Integer) ((Map.Entry) it2.next()).getValue()).intValue() > 1) {
                hashSet.add("Preload configurations include duplicated ad unit IDs and ad format combinations");
                z = true;
                break;
            }
        }
        HashMap map2 = new HashMap();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            PreloadConfiguration preloadConfiguration2 = (PreloadConfiguration) it3.next();
            AdFormat adFormat = preloadConfiguration2.getAdFormat();
            if (zza.contains(preloadConfiguration2.getAdFormat())) {
                map2.compute(adFormat, new BiFunction() { // from class: com.google.android.gms.ads.internal.client.zzen
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj, Object obj2) {
                        Integer num = (Integer) obj2;
                        Set set = zzex.zza;
                        return Integer.valueOf(num != null ? 1 + num.intValue() : 1);
                    }
                });
                if (preloadConfiguration2.getBufferSize() > 15) {
                    Locale locale = Locale.US;
                    hashSet.add("Preload configurations' buffer size exceeds the maximum limit 15 for " + adFormat.name());
                } else if (preloadConfiguration2.getBufferSize() < 0) {
                    Locale locale2 = Locale.US;
                    hashSet.add("Preload configurations' buffer size less than 0 for " + adFormat.name());
                }
            } else {
                hashSet.add("PreloadConfiguration ad format is not supported:".concat(String.valueOf(preloadConfiguration2.getAdFormat())));
            }
            z = true;
        }
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(AdFormat.APP_OPEN_AD, (Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o00o00)), new AbstractMap.SimpleEntry(AdFormat.INTERSTITIAL, (Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o00o000o)), new AbstractMap.SimpleEntry(AdFormat.REWARDED, (Integer) zzbe.zzc().OooO00o(AbstractC1448c7.oo00oO))};
        HashMap map3 = new HashMap(3);
        for (int i = 0; i < 3; i++) {
            Map.Entry entry = entryArr[i];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (map3.put(key, value) != null) {
                key.toString();
                throw new IllegalArgumentException("duplicate key: ".concat(String.valueOf(key)));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map3);
        for (Map.Entry entry2 : map2.entrySet()) {
            AdFormat adFormat2 = (AdFormat) entry2.getKey();
            int iIntValue = ((Integer) entry2.getValue()).intValue();
            Integer num = (Integer) mapUnmodifiableMap.getOrDefault(adFormat2, 0);
            if (iIntValue > num.intValue()) {
                Locale locale3 = Locale.US;
                hashSet.add("Preload configurations' size exceeds the maximum limit " + num + " for " + adFormat2.name());
                z = true;
            }
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            Iterator it4 = hashSet.iterator();
            while (it4.hasNext()) {
                sb.append((String) it4.next());
                if (it4.hasNext()) {
                    sb.append(", ");
                }
            }
            String string = sb.toString();
            com.google.android.gms.ads.internal.util.client.zzo.zzg(string);
            status = new Status(13, string, null, null);
        } else {
            status = Status.RESULT_SUCCESS;
        }
        String strOooO0oO = status.OooO0oO();
        if (strOooO0oO == null) {
            strOooO0oO = "";
        }
        o000000O.OooO00o(strOooO0oO, status.OooOO0());
        AbstractC1448c7.OooO00o(context);
        synchronized (this.f16074OooO0O0) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator it5 = list.iterator();
                while (it5.hasNext()) {
                    PreloadConfiguration preloadConfiguration3 = (PreloadConfiguration) it5.next();
                    zzm zzmVarZza = zzr.zza.zza(context, preloadConfiguration3.getAdRequest().zza());
                    zzmVarZza.zzc.putBoolean("is_sdk_preload", true);
                    if (preloadConfiguration3.getBufferSize() <= 0) {
                        int iOrdinal = preloadConfiguration3.getAdFormat().ordinal();
                        bufferSize = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 5 ? 1 : ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.f17737OooOooo)).intValue() : ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.f17741Oooo00O)).intValue() : ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.f17740Oooo000)).intValue();
                    } else {
                        bufferSize = preloadConfiguration3.getBufferSize();
                    }
                    int iOrdinal2 = preloadConfiguration3.getAdFormat().ordinal();
                    int iMax = Math.max(Math.min(iOrdinal2 != 1 ? iOrdinal2 != 2 ? iOrdinal2 != 5 ? 1 : ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.f17735OooOoo0)).intValue() : ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.f17736OooOooO)).intValue() : ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.f17734OooOoo)).intValue(), 15), 1);
                    int iOrdinal3 = preloadConfiguration3.getAdFormat().ordinal();
                    arrayList.add(new zzft(preloadConfiguration3.getAdUnitId(), preloadConfiguration3.getAdFormat().getValue(), zzmVarZza, Math.max(Math.min(bufferSize, iMax), Math.min(iOrdinal3 != 1 ? iOrdinal3 != 2 ? iOrdinal3 != 5 ? 1 : ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.f17742Oooo00o)).intValue() : ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.f17743Oooo0O0)).intValue() : ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.f17739Oooo0)).intValue(), iMax))));
                }
                try {
                    com.google.android.gms.ads.zzb.zza(context).zzi(arrayList, new zzes(this, preloadCallback));
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to start preload.", e);
                    return Status.RESULT_INTERNAL_ERROR;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return Status.RESULT_SUCCESS;
    }

    public final String zzi() {
        String strZzf;
        synchronized (this.f16077OooO0o) {
            try {
                o000000O.OooOO0O(this.f16079OooO0oO != null, "MobileAds.initialize() must be called prior to getting version string.");
                try {
                    strZzf = this.f16079OooO0oO.zzf();
                    if (strZzf == null) {
                        strZzf = "";
                    }
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to get internal version.", e);
                    return "";
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return strZzf;
    }

    public final void zzn(Context context) {
        synchronized (this.f16077OooO0o) {
            OooO0OO(context);
            try {
                this.f16079OooO0oO.zzi();
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to disable mediation adapter initialization.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ae A[Catch: all -> 0x005c, TryCatch #2 {all -> 0x005c, RemoteException -> 0x005f, blocks: (B:25:0x0033, B:27:0x0053, B:41:0x007a, B:43:0x008c, B:45:0x009e, B:52:0x00e1, B:46:0x00ae, B:48:0x00bc, B:50:0x00ce, B:51:0x00d9, B:34:0x0061, B:35:0x0063, B:38:0x006f, B:40:0x0075), top: B:60:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d9 A[Catch: all -> 0x005c, TryCatch #2 {all -> 0x005c, RemoteException -> 0x005f, blocks: (B:25:0x0033, B:27:0x0053, B:41:0x007a, B:43:0x008c, B:45:0x009e, B:52:0x00e1, B:46:0x00ae, B:48:0x00bc, B:50:0x00ce, B:51:0x00d9, B:34:0x0061, B:35:0x0063, B:38:0x006f, B:40:0x0075), top: B:60:0x0033 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzo(final android.content.Context r3, @androidx.annotation.Nullable java.lang.String r4, @androidx.annotation.Nullable com.google.android.gms.ads.initialization.OnInitializationCompleteListener r5) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzex.zzo(android.content.Context, java.lang.String, com.google.android.gms.ads.initialization.OnInitializationCompleteListener):void");
    }

    public final void zzr(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.f16077OooO0o) {
            OooO0OO(context);
            this.f16080OooO0oo = onAdInspectorClosedListener;
            try {
                this.f16079OooO0oO.zzm(new zzeu());
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to open the ad inspector.");
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                }
            }
        }
    }

    public final void zzs(Context context, String str) {
        synchronized (this.f16077OooO0o) {
            o000000O.OooOO0O(this.f16079OooO0oO != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.f16079OooO0oO.zzn(new OooO0OO(context), str);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to open debug menu.", e);
            }
        }
    }

    public final void zzt(Class cls) {
        synchronized (this.f16077OooO0o) {
            try {
                this.f16079OooO0oO.zzh(cls.getCanonicalName());
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to register RtbAdapter", e);
            }
        }
    }

    public final void zzu(boolean z) {
        synchronized (this.f16077OooO0o) {
            o000000O.OooOO0O(this.f16079OooO0oO != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.f16079OooO0oO.zzp(z);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to set app mute state.", e);
            }
        }
    }

    public final void zzv(float f) {
        boolean z = true;
        o000000O.OooO00o("The app volume must be a value between 0 and 1 inclusive.", f >= 0.0f && f <= 1.0f);
        synchronized (this.f16077OooO0o) {
            if (this.f16079OooO0oO == null) {
                z = false;
            }
            o000000O.OooOO0O(z, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.f16079OooO0oO.zzq(f);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to set app volume.", e);
            }
        }
    }

    public final void zzw(String str) {
        synchronized (this.f16077OooO0o) {
            o000000O.OooOO0O(this.f16079OooO0oO != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.f16079OooO0oO.zzt(str);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to set plugin.", e);
            }
        }
    }

    public final void zzx(@NonNull RequestConfiguration requestConfiguration) {
        o000000O.OooO00o("Null passed to setRequestConfiguration.", requestConfiguration != null);
        synchronized (this.f16077OooO0o) {
            try {
                RequestConfiguration requestConfiguration2 = this.f16072OooO;
                this.f16072OooO = requestConfiguration;
                if (this.f16079OooO0oO == null) {
                    return;
                }
                if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                    try {
                        this.f16079OooO0oO.zzu(new zzfv(requestConfiguration));
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to set request configuration parcel.", e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzy() {
        synchronized (this.f16077OooO0o) {
            zzcz zzczVar = this.f16079OooO0oO;
            boolean zZzv = false;
            if (zzczVar == null) {
                return false;
            }
            try {
                zZzv = zzczVar.zzv();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to get app mute state.", e);
            }
            return zZzv;
        }
    }

    public final boolean zzz(boolean z) {
        synchronized (this.f16077OooO0o) {
            try {
                o000000O.OooOO0O(this.f16079OooO0oO != null, "MobileAds.initialize() must be called prior to enable/disable the publisher first-party ID.");
                try {
                    this.f16079OooO0oO.zzj(z);
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to " + (z ? C3401a.f9923j : "disable") + " the publisher first-party ID.", e);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
