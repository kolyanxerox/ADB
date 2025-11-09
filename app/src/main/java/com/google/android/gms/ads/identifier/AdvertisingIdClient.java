package com.google.android.gms.ads.identifier;

import OooOooo.o000O0O0;
import OooOooo.o000O0Oo;
import OooOooo.o000O0o;
import OooOooo.o000OO0O;
import Oooo00O.o000000O;
import Oooo0O0.OooO0OO;
import Oooo0oo.o0000O0;
import Oooo0oo.o0000O0O;
import Oooo0oo.o0000oo;
import Oooo0oo.o000OO;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.datastore.preferences.protobuf.OooO00o;
import androidx.work.WorkRequest;
import com.google.android.gms.common.util.VisibleForTesting;
import com.ironsource.C3034d9;
import com.ironsource.C3126fq;
import com.ironsource.C3912zo;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class AdvertisingIdClient {

    @Nullable
    o000O0o zza;

    @Nullable
    o000OO zzb;
    boolean zzc;
    final Object zzd;

    @Nullable
    zzb zze;
    final long zzf;
    private final Context zzg;

    public static final class Info {

        @Nullable
        private final String zza;
        private final boolean zzb;

        @Deprecated
        public Info(@Nullable String str, boolean z) {
            this.zza = str;
            this.zzb = z;
        }

        @Nullable
        public String getId() {
            return this.zza;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.zzb;
        }

        @NonNull
        public String toString() {
            String str = this.zza;
            boolean z = this.zzb;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    public AdvertisingIdClient(@NonNull Context context) {
        this(context, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, false, false);
    }

    @NonNull
    public static Info getAdvertisingIdInfo(@NonNull Context context) throws IllegalStateException, o000O0O0, IOException, o000OO0O {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, true, false);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.zzb(false);
            Info infoZzd = advertisingIdClient.zzd(-1);
            advertisingIdClient.zzc(infoZzd, true, 0.0f, SystemClock.elapsedRealtime() - jElapsedRealtime, "", null);
            return infoZzd;
        } finally {
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(@NonNull Context context) throws o000O0O0, IOException, o000OO0O {
        boolean z;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.zzb(false);
            o000000O.OooO0oO("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                try {
                    if (!advertisingIdClient.zzc) {
                        synchronized (advertisingIdClient.zzd) {
                            zzb zzbVar = advertisingIdClient.zze;
                            if (zzbVar == null || !zzbVar.zzb) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            advertisingIdClient.zzb(false);
                            if (!advertisingIdClient.zzc) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                        }
                    }
                    o000000O.OooO0oo(advertisingIdClient.zza);
                    o000000O.OooO0oo(advertisingIdClient.zzb);
                    try {
                        o0000O0 o0000o02 = (o0000O0) advertisingIdClient.zzb;
                        o0000o02.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        Parcel parcelOooO = o0000o02.OooO(parcelObtain, 6);
                        int i = o0000oo.f13890OooO00o;
                        z = parcelOooO.readInt() != 0;
                        parcelOooO.recycle();
                    } catch (RemoteException e2) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                        throw new IOException("Remote exception");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            advertisingIdClient.zze();
            advertisingIdClient.zza();
            return z;
        } catch (Throwable th2) {
            advertisingIdClient.zza();
            throw th2;
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    private final Info zzd(int i) throws IOException {
        Info info;
        o000000O.OooO0oO("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.zzc) {
                    synchronized (this.zzd) {
                        zzb zzbVar = this.zze;
                        if (zzbVar == null || !zzbVar.zzb) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        zzb(false);
                        if (!this.zzc) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                o000000O.OooO0oo(this.zza);
                o000000O.OooO0oo(this.zzb);
                try {
                    o0000O0 o0000o02 = (o0000O0) this.zzb;
                    o0000o02.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    Parcel parcelOooO = o0000o02.OooO(parcelObtain, 1);
                    String string = parcelOooO.readString();
                    parcelOooO.recycle();
                    o0000O0 o0000o03 = (o0000O0) this.zzb;
                    o0000o03.getClass();
                    Parcel parcelObtain2 = Parcel.obtain();
                    parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i2 = o0000oo.f13890OooO00o;
                    parcelObtain2.writeInt(1);
                    Parcel parcelOooO2 = o0000o03.OooO(parcelObtain2, 2);
                    boolean z = parcelOooO2.readInt() != 0;
                    parcelOooO2.recycle();
                    info = new Info(string, z);
                } catch (RemoteException e2) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zze();
        return info;
    }

    private final void zze() {
        synchronized (this.zzd) {
            zzb zzbVar = this.zze;
            if (zzbVar != null) {
                zzbVar.zza.countDown();
                try {
                    this.zze.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.zzf;
            if (j > 0) {
                this.zze = new zzb(this, j);
            }
        }
    }

    public final void finalize() throws Throwable {
        zza();
        super.finalize();
    }

    @NonNull
    public Info getInfo() throws IOException {
        return zzd(-1);
    }

    public void start() throws IllegalStateException, o000O0O0, IOException, o000OO0O {
        zzb(true);
    }

    public final void zza() {
        o000000O.OooO0oO("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzg == null || this.zza == null) {
                    return;
                }
                try {
                    if (this.zzc) {
                        OooO0OO.OooO00o().OooO0O0(this.zzg, this.zza);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.zzc = false;
                this.zzb = null;
                this.zza = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    public final void zzb(boolean z) throws IllegalStateException, o000O0O0, IOException, o000OO0O {
        o000000O.OooO0oO("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzc) {
                    zza();
                }
                Context context = this.zzg;
                try {
                    context.getPackageManager().getPackageInfo(C3126fq.f8595b, 0);
                    int iOooO0OO = o000O0Oo.f13671OooO0O0.OooO0OO(context, 12451000);
                    if (iOooO0OO != 0 && iOooO0OO != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    o000O0o o000o0o2 = new o000O0o();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!OooO0OO.OooO00o().OooO0OO(context, context.getClass().getName(), intent, o000o0o2, 1, null)) {
                            throw new IOException("Connection failure");
                        }
                        this.zza = o000o0o2;
                        try {
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            IBinder iBinderOooO00o = o000o0o2.OooO00o();
                            int i = o0000O0O.f13889OooOo0O;
                            IInterface iInterfaceQueryLocalInterface = iBinderOooO00o.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.zzb = iInterfaceQueryLocalInterface instanceof o000OO ? (o000OO) iInterfaceQueryLocalInterface : new o0000O0(iBinderOooO00o);
                            this.zzc = true;
                            if (z) {
                                zze();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new o000OO0O();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    public final boolean zzc(@Nullable Info info, boolean z, float f, long j, String str, @Nullable Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap mapOooOOo = OooO00o.OooOOo(C3034d9.h.f8079L0, "1");
        if (info != null) {
            mapOooOOo.put("limit_ad_tracking", true != info.isLimitAdTrackingEnabled() ? "0" : "1");
            String id = info.getId();
            if (id != null) {
                mapOooOOo.put("ad_id_size", Integer.toString(id.length()));
            }
        }
        if (th != null) {
            mapOooOOo.put(C3912zo.a.f13038g, th.getClass().getName());
        }
        mapOooOOo.put("tag", "AdvertisingIdClient");
        mapOooOOo.put("time_spent", Long.toString(j));
        new zza(this, mapOooOOo).start();
        return true;
    }

    @VisibleForTesting
    public AdvertisingIdClient(@NonNull Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        this.zzd = new Object();
        o000000O.OooO0oo(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.zzg = context;
        this.zzc = false;
        this.zzf = j;
    }
}
