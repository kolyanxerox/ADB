package Oooo00O;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o0000oo {

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final Uri f13807OooO0Oo = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f13808OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f13809OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f13810OooO0OO;

    public o0000oo(String str, boolean z) {
        o000000O.OooO0o0(str);
        this.f13808OooO00o = str;
        o000000O.OooO0o0("com.google.android.gms");
        this.f13809OooO0O0 = "com.google.android.gms";
        this.f13810OooO0OO = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.Intent OooO00o(android.content.Context r6) throws android.os.RemoteException, Oooo00O.o00000 {
        /*
            r5 = this;
            java.lang.String r0 = "ConnectionStatusConfig"
            r1 = 0
            java.lang.String r2 = r5.f13808OooO00o
            if (r2 == 0) goto La3
            boolean r3 = r5.f13810OooO0OO
            if (r3 == 0) goto L94
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = "serviceActionBundleKey"
            r3.putString(r4, r2)
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch: java.lang.IllegalArgumentException -> L34 android.os.RemoteException -> L36
            android.net.Uri r4 = Oooo00O.o0000oo.f13807OooO0Oo     // Catch: java.lang.IllegalArgumentException -> L34 android.os.RemoteException -> L36
            android.content.ContentProviderClient r6 = r6.acquireUnstableContentProviderClient(r4)     // Catch: java.lang.IllegalArgumentException -> L34 android.os.RemoteException -> L36
            if (r6 == 0) goto L38
            java.lang.String r4 = "serviceIntentCall"
            android.os.Bundle r3 = r6.call(r4, r1, r3)     // Catch: java.lang.Throwable -> L2f
            r6.release()     // Catch: java.lang.IllegalArgumentException -> L2b android.os.RemoteException -> L2d
            goto L4e
        L2b:
            r6 = move-exception
            goto L41
        L2d:
            r6 = move-exception
            goto L41
        L2f:
            r3 = move-exception
            r6.release()     // Catch: java.lang.IllegalArgumentException -> L34 android.os.RemoteException -> L36
            throw r3     // Catch: java.lang.IllegalArgumentException -> L34 android.os.RemoteException -> L36
        L34:
            r6 = move-exception
            goto L40
        L36:
            r6 = move-exception
            goto L40
        L38:
            android.os.RemoteException r6 = new android.os.RemoteException     // Catch: java.lang.IllegalArgumentException -> L34 android.os.RemoteException -> L36
            java.lang.String r3 = "Failed to acquire ContentProviderClient"
            r6.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L34 android.os.RemoteException -> L36
            throw r6     // Catch: java.lang.IllegalArgumentException -> L34 android.os.RemoteException -> L36
        L40:
            r3 = r1
        L41:
            java.lang.String r4 = "Dynamic intent resolution failed: "
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r4.concat(r6)
            android.util.Log.w(r0, r6)
        L4e:
            if (r3 == 0) goto L89
            java.lang.String r6 = "serviceResponseIntentKey"
            android.os.Parcelable r6 = r3.getParcelable(r6)
            r1 = r6
            android.content.Intent r1 = (android.content.Intent) r1
            if (r1 != 0) goto L89
            java.lang.String r6 = "serviceMissingResolutionIntentKey"
            android.os.Parcelable r6 = r3.getParcelable(r6)
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
            if (r6 != 0) goto L66
            goto L89
        L66:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Dynamic lookup for intent failed for action "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r2 = " but has possible resolution"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r0, r1)
            Oooo00O.o00000 r0 = new Oooo00O.o00000
            OooOooo.o000Oo0 r1 = new OooOooo.o000Oo0
            r2 = 25
            r1.<init>(r2, r6)
            r0.<init>(r1)
            throw r0
        L89:
            if (r1 != 0) goto L94
            java.lang.String r6 = "Dynamic lookup for intent failed for action: "
            java.lang.String r6 = r6.concat(r2)
            android.util.Log.w(r0, r6)
        L94:
            if (r1 != 0) goto La2
            android.content.Intent r6 = new android.content.Intent
            r6.<init>(r2)
            java.lang.String r0 = r5.f13809OooO0O0
            android.content.Intent r6 = r6.setPackage(r0)
            return r6
        La2:
            return r1
        La3:
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            android.content.Intent r6 = r6.setComponent(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Oooo00O.o0000oo.OooO00o(android.content.Context):android.content.Intent");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0000oo)) {
            return false;
        }
        o0000oo o0000ooVar = (o0000oo) obj;
        return o000000O.OooOO0o(this.f13808OooO00o, o0000ooVar.f13808OooO00o) && o000000O.OooOO0o(this.f13809OooO0O0, o0000ooVar.f13809OooO0O0) && o000000O.OooOO0o(null, null) && this.f13810OooO0OO == o0000ooVar.f13810OooO0OO;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13808OooO00o, this.f13809OooO0O0, null, 4225, Boolean.valueOf(this.f13810OooO0OO)});
    }

    public final String toString() {
        String str = this.f13808OooO00o;
        if (str != null) {
            return str;
        }
        o000000O.OooO0oo(null);
        throw null;
    }
}
