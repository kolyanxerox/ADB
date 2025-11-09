package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.r4 */
/* loaded from: classes2.dex */
public final class C1998r4 {

    /* renamed from: OooO00o */
    public final com.google.android.gms.internal.measurement.o0OOO00 f23739OooO00o;

    /* renamed from: OooO0O0 */
    public final C1889o6 f23740OooO0O0;

    /* renamed from: OooO0OO */
    public final boolean f23741OooO0OO;

    public C1998r4() {
        this.f23740OooO0O0 = C1926p6.Oooo00O();
        this.f23741OooO0OO = false;
        this.f23739OooO00o = new com.google.android.gms.internal.measurement.o0OOO00(3);
    }

    public final synchronized void OooO00o(InterfaceC1961q4 interfaceC1961q4) {
        if (this.f23741OooO0OO) {
            try {
                interfaceC1961q4.OooO0Oo(this.f23740OooO0O0);
            } catch (NullPointerException e) {
                zzv.zzp().OooO0oo("AdMobClearcutLogger.modify", e);
            }
        }
    }

    public final synchronized void OooO0O0(int i) {
        if (this.f23741OooO0OO) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o0o)).booleanValue()) {
                OooO0Oo(i);
            } else {
                OooO0o0(i);
            }
        }
    }

    public final synchronized String OooO0OO(int i) {
        StringBuilder sb;
        String strOooOooO = ((C1926p6) this.f23740OooO0O0.f25822OooOo0o).OooOooO();
        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String strEncodeToString = Base64.encodeToString(((C1926p6) this.f23740OooO0O0.OooO0O0()).OooO0Oo(), 3);
        sb = new StringBuilder("id=");
        sb.append(strOooOooO);
        sb.append(",timestamp=");
        sb.append(jElapsedRealtime);
        sb.append(",event=");
        sb.append(i - 1);
        sb.append(",data=");
        sb.append(strEncodeToString);
        sb.append("\n");
        return sb.toString();
    }

    public final synchronized void OooO0Oo(int i) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(new File(externalStorageDirectory, "clearcut_events.txt").getPath()), true);
            try {
                try {
                    fileOutputStream.write(OooO0OO(i).getBytes());
                } finally {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        zze.zza("Could not close Clearcut output stream.");
                    }
                }
            } catch (IOException unused2) {
                zze.zza("Could not write Clearcut to file.");
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    zze.zza("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            zze.zza("Could not find file for Clearcut");
        }
    }

    public final synchronized void OooO0o0(int i) {
        C1889o6 c1889o6 = this.f23740OooO0O0;
        c1889o6.OooO0Oo();
        C1926p6.OooOo((C1926p6) c1889o6.f25822OooOo0o);
        List listZzd = zzs.zzd();
        c1889o6.OooO0Oo();
        C1926p6.OooOo0o((C1926p6) c1889o6.f25822OooOo0o, listZzd);
        byte[] bArrOooO0Oo = ((C1926p6) this.f23740OooO0O0.OooO0O0()).OooO0Oo();
        com.google.android.gms.internal.measurement.o0OOO00 o0ooo00 = this.f23739OooO00o;
        oOo0o00 ooo0o00 = new oOo0o00(o0ooo00, bArrOooO0Oo);
        int i2 = i - 1;
        ooo0o00.f22921OooOo0o = i2;
        synchronized (ooo0o00) {
            ((ExecutorService) o0ooo00.f26562OooOo).execute(new RunnableC1442c1(ooo0o00, 7));
        }
        zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i2, 10))));
    }

    public C1998r4(com.google.android.gms.internal.measurement.o0OOO00 o0ooo00) {
        this.f23740OooO0O0 = C1926p6.Oooo00O();
        this.f23739OooO00o = o0ooo00;
        this.f23741OooO0OO = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o0o0o)).booleanValue();
    }
}
