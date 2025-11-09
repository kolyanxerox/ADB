package com.google.android.gms.internal.ads;

import android.content.p000pm.PackageManager$OnChecksumsReadyListener;
import android.content.pm.ApkChecksum;
import java.util.List;
import org.apache.tika.fork.ForkServer;

/* renamed from: com.google.android.gms.internal.ads.t0 */
/* loaded from: classes2.dex */
public final class PackageManagerOnChecksumsReadyListenerC2068t0 implements PackageManager$OnChecksumsReadyListener {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f24212OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final jq0 f24213OooO0O0;

    public /* synthetic */ PackageManagerOnChecksumsReadyListenerC2068t0(jq0 jq0Var) {
        this.f24212OooO00o = 1;
        this.f24213OooO0O0 = jq0Var;
    }

    public final void onChecksumsReady(List list) {
        int i = 0;
        jq0 jq0Var = this.f24213OooO0O0;
        switch (this.f24212OooO00o) {
            case 0:
                if (list == null) {
                    jq0Var.OooO0o("");
                    break;
                } else {
                    try {
                        int size = list.size();
                        while (i < size) {
                            ApkChecksum apkChecksumOooO0o0 = OooOO0.OooO0O0.OooO0o0(list.get(i));
                            if (apkChecksumOooO0o0.getType() == 8) {
                                ao0 ao0VarOooO0Oo = ao0.f17069OooO0Oo.OooO0Oo();
                                byte[] value = apkChecksumOooO0o0.getValue();
                                jq0Var.OooO0o(ao0VarOooO0Oo.OooO0oO(value.length, value));
                                break;
                            } else {
                                i++;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                    jq0Var.OooO0o("");
                    break;
                }
            default:
                if (list == null) {
                    jq0Var.OooO0o(null);
                    break;
                } else {
                    try {
                        int size2 = list.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            ApkChecksum apkChecksumOooO0o02 = OooOO0.OooO0O0.OooO0o0(list.get(i2));
                            if (apkChecksumOooO0o02.getType() == 8) {
                                byte[] value2 = apkChecksumOooO0o02.getValue();
                                char[] cArr = AbstractC2217x1.f25494OooO00o;
                                int length = value2.length;
                                char[] cArr2 = new char[length + length];
                                while (i < value2.length) {
                                    byte b = value2[i];
                                    int i3 = (b & ForkServer.ERROR) >>> 4;
                                    char[] cArr3 = AbstractC2217x1.f25494OooO00o;
                                    int i4 = i + i;
                                    cArr2[i4] = cArr3[i3];
                                    cArr2[i4 + 1] = cArr3[b & 15];
                                    i++;
                                }
                                jq0Var.OooO0o(new String(cArr2));
                                break;
                            }
                        }
                        jq0Var.OooO0o(null);
                        break;
                    } catch (Throwable unused2) {
                        jq0Var.OooO0o(null);
                    }
                }
        }
    }

    public PackageManagerOnChecksumsReadyListenerC2068t0() {
        this.f24212OooO00o = 0;
        this.f24213OooO0O0 = new jq0();
    }
}
