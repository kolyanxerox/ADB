package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzcj;
import com.google.android.gms.ads.internal.zzv;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.t6 */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC2074t6 implements Callable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f24244OooOo0O;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f24244OooOo0O) {
            case 0:
                return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
            case 1:
                ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                return new oa0(System.currentTimeMillis() - zzv.zzp().OooO0Oo().zzg().f21507OooO0o);
            case 2:
                return new aa0(zzv.zzt().zzb(), zzv.zzt().zzm(), 1);
            case 3:
                Bundle bundle = new Bundle();
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free", runtime.freeMemory());
                bundle.putLong("runtime_max", runtime.maxMemory());
                bundle.putLong("runtime_total", runtime.totalMemory());
                bundle.putInt("web_view_count", zzv.zzp().f23636OooOO0.get());
                return new x90(1, bundle);
            case 4:
                return new ub0(new JSONObject());
            case 5:
                HashMap map = new HashMap();
                String str = (String) zzbe.zzc().OooO00o(AbstractC1448c7.f17754OoooOOO);
                if (str != null && !str.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.f17755OoooOOo)).intValue()) {
                        for (String str2 : str.split(",", -1)) {
                            map.put(str2, zzcj.zza(str2));
                        }
                    }
                }
                return new wa0(map, 3);
            default:
                return null;
        }
    }
}
