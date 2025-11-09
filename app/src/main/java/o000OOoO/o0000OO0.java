package o000oOoo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.applovin.impl.o0OOO0o;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import kotlin.jvm.internal.OooOo;
import o00O0oOo.o000O0O0;
import o00OO00o.OooO;
import o00OO00o.OooO0o;

/* loaded from: classes2.dex */
public final class o0000OO0 implements PluginRegistry.ActivityResultListener {

    /* renamed from: OooOooo, reason: collision with root package name */
    public static final int f30990OooOooo = (o000O0o.class.hashCode() + 43) & 65535;

    /* renamed from: Oooo000, reason: collision with root package name */
    public static final int f30991Oooo000 = (o000O0o.class.hashCode() + 83) & 65535;

    /* renamed from: OooOo, reason: collision with root package name */
    public boolean f30992OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Activity f30993OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public o000O00O f30994OooOo0o = null;

    /* renamed from: OooOoO, reason: collision with root package name */
    public String f30995OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public boolean f30996OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public int f30997OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public EventChannel.EventSink f30998OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public ArrayList f30999OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public byte[] f31000OooOooO;

    public o0000OO0(Activity activity) {
        this.f30993OooOo0O = activity;
    }

    public final void OooO00o(boolean z) {
        if (this.f30998OooOoo == null || OooOo.OooO00o(this.f30995OooOoO, "dir")) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new o0OOO0o(this, z, 1));
    }

    public final void OooO0O0(String str, String str2) {
        OooO00o(false);
        o000O00O o000o00o2 = this.f30994OooOo0o;
        if (o000o00o2 != null) {
            o000o00o2.error(str, str2, null);
        }
        this.f30994OooOo0o = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0014  */
    /* JADX WARN: Type inference failed for: r1v0, types: [o000oOoo.o000O00O] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0OO(java.io.Serializable r13) {
        /*
            r12 = this;
            r0 = 0
            r12.OooO00o(r0)
            o000oOoo.o000O00O r1 = r12.f30994OooOo0o
            if (r1 == 0) goto L8d
            r2 = 0
            if (r13 == 0) goto L14
            boolean r3 = r13 instanceof java.lang.String
            if (r3 == 0) goto L11
            r3 = r13
            goto L12
        L11:
            r3 = r2
        L12:
            if (r3 != 0) goto L88
        L14:
            boolean r3 = r13 instanceof java.util.ArrayList
            if (r3 == 0) goto L1b
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            goto L1c
        L1b:
            r13 = r2
        L1c:
            if (r13 == 0) goto L87
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r13.size()
        L27:
            if (r0 >= r4) goto L88
            java.lang.Object r5 = r13.get(r0)
            int r0 = r0 + 1
            boolean r6 = r5 instanceof o000oOoo.o0000O
            if (r6 == 0) goto L36
            o000oOoo.o0000O r5 = (o000oOoo.o0000O) r5
            goto L37
        L36:
            r5 = r2
        L37:
            if (r5 == 0) goto L80
            oo00o.OooOO0 r6 = new oo00o.OooOO0
            java.lang.String r7 = "path"
            java.lang.String r8 = r5.f30985OooO00o
            r6.<init>(r7, r8)
            oo00o.OooOO0 r7 = new oo00o.OooOO0
            java.lang.String r8 = "name"
            java.lang.String r9 = r5.f30986OooO0O0
            r7.<init>(r8, r9)
            oo00o.OooOO0 r8 = new oo00o.OooOO0
            long r9 = r5.f30988OooO0Oo
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            java.lang.String r10 = "size"
            r8.<init>(r10, r9)
            oo00o.OooOO0 r9 = new oo00o.OooOO0
            java.lang.String r10 = "bytes"
            byte[] r11 = r5.f30989OooO0o0
            r9.<init>(r10, r11)
            oo00o.OooOO0 r10 = new oo00o.OooOO0
            android.net.Uri r5 = r5.f30987OooO0OO
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r11 = "identifier"
            r10.<init>(r11, r5)
            oo00o.OooOO0[] r5 = new oo00o.OooOO0[]{r6, r7, r8, r9, r10}
            java.util.HashMap r6 = new java.util.HashMap
            r7 = 5
            int r7 = o00O0.o0O0O00.OooOOOO(r7)
            r6.<init>(r7)
            o00O0.o0O0O00.OooOo0O(r6, r5)
            goto L81
        L80:
            r6 = r2
        L81:
            if (r6 == 0) goto L27
            r3.add(r6)
            goto L27
        L87:
            r3 = r2
        L88:
            r1.success(r3)
            r12.f30994OooOo0o = r2
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o000oOoo.o0000OO0.OooO0OO(java.io.Serializable):void");
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public final boolean onActivityResult(int i, int i2, Intent intent) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Activity activity = this.f30993OooOo0O;
        if (i == f30991Oooo000) {
            if (i2 == -1) {
                Uri data = intent != null ? intent.getData() : null;
                if (data != null) {
                    OooO00o(true);
                    try {
                        byte[] bArr = this.f31000OooOooO;
                        OutputStream outputStreamOpenOutputStream = activity.getContentResolver().openOutputStream(data);
                        if (outputStreamOpenOutputStream != null) {
                            if (bArr != null) {
                                try {
                                    outputStreamOpenOutputStream.write(bArr);
                                } finally {
                                }
                            }
                            outputStreamOpenOutputStream.close();
                        }
                        OooO0OO(data.getPath());
                        return true;
                    } catch (IOException e) {
                        Log.e("FilePickerDelegate", "Error while saving file", e);
                        OooO0O0("Error while saving file", e.getMessage());
                    }
                }
                return false;
            }
            if (i2 == 0) {
                OooO0OO(null);
                return false;
            }
        } else {
            if (i != f30990OooOooo) {
                OooO0O0("unknown_activity", "Unknown activity error, please file an issue.");
                return false;
            }
            if (i2 == -1) {
                OooO00o(true);
                int i3 = this.f30997OooOoOO;
                boolean z = this.f30996OooOoO0;
                String str = this.f30995OooOoO;
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                OooO oooO = o000O0O0.f31514OooO00o;
                o00O0oOo.o0000OO0.OooOo0(o00O0oOo.o0000OO0.OooO0O0(OooO0o.f31999OooOo0O), null, new o000Oo0(intent, this, activity, i3, z, str2, null), 3);
                return true;
            }
            if (i2 == 0) {
                OooO0OO(null);
                return true;
            }
        }
        return false;
    }
}
