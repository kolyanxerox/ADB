package o00Oo0oo;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.internal.view.SupportMenu;
import com.applovin.shadow.okio.Utf8;
import com.google.android.gms.internal.ads.ez0;
import com.google.android.gms.internal.measurement.oO0;
import com.google.android.gms.internal.measurement.oO000;
import com.google.android.gms.internal.measurement.oO00O0o0;
import com.google.android.gms.internal.measurement.oO00O0oO;
import com.google.android.gms.internal.measurement.oO00o0;
import com.google.android.gms.internal.measurement.oO0O00oO;
import com.google.android.gms.internal.measurement.oO0OOo0o;
import com.google.android.gms.internal.measurement.ooOOO0Oo;
import com.google.android.gms.internal.measurement.ooOOOOoo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.jvm.internal.OooO;
import kotlin.jvm.internal.OooOo;
import o0000oo0.o00000OO;
import o0000oo0.o00Oo0;
import o0000oo0.o0O0O00;
import o0000oo0.o0OO00O;
import o0000oo0.o0Oo0oo;
import o0000oo0.oo0o0Oo;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO00o;
import o00O0o0O.o00O0O;
import o00O0o0O.o00Ooo;
import o00O0o0o.o0ooOOo;
import o00O0oO.o000000;
import o00O0oOo.o0000OO0;
import o00O0oOo.o0000Ooo;
import o00OOOoO.o00000;
import o00OOOoO.o00000O0;
import o00OOOoO.o000O0;
import o00OOOoO.o000O0O0;
import o00OOOoO.o00O0000;
import o00OOOoO.o0O0ooO;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public abstract class o00oO0o {
    public static final boolean OooO(AssertionError assertionError) {
        Logger logger = o000O0.f32570OooO00o;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? o000000.Oooo0o("getsockname failed", message) : false) {
                return true;
            }
        }
        return false;
    }

    public static final o000O0O0 OooO00o(o0O0ooO o0o0ooo) {
        OooOo.OooO0o0(o0o0ooo, "<this>");
        return new o000O0O0(o0o0ooo);
    }

    public static Object OooO0O0(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(o00oO0o.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static long OooO0OO(long j) {
        if (j < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j;
    }

    public static int OooO0Oo(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static void OooO0o(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            o00Oo0 o00oo0 = (o00Oo0) obj;
            o0Oo0oo o0oo0oo = new o0Oo0oo(o00oo0);
            for (o00000OO o00000oo2 : o00oo0.f29671OooO0O0) {
                boolean z = o00oo0.f29675OooO0o0 == 0;
                o0OO00O o0oo00o = new o0OO00O(o00000oo2, !z);
                if (!map.containsKey(o0oo00o)) {
                    map.put(o0oo00o, new HashSet());
                }
                Set set = (Set) map.get(o0oo00o);
                if (!set.isEmpty() && z) {
                    throw new IllegalArgumentException("Multiple components provide " + o00000oo2 + ".");
                }
                set.add(o0oo0oo);
            }
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            for (o0Oo0oo o0oo0oo2 : (Set) it.next()) {
                for (oo0o0Oo oo0o0oo : o0oo0oo2.f29687OooO00o.f29672OooO0OO) {
                    if (oo0o0oo.f29695OooO0OO == 0) {
                        Set<o0Oo0oo> set2 = (Set) map.get(new o0OO00O(oo0o0oo.f29693OooO00o, oo0o0oo.f29694OooO0O0 == 2));
                        if (set2 != null) {
                            for (o0Oo0oo o0oo0oo3 : set2) {
                                o0oo0oo2.f29688OooO0O0.add(o0oo0oo3);
                                o0oo0oo3.f29689OooO0OO.add(o0oo0oo2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        HashSet hashSet2 = new HashSet();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            o0Oo0oo o0oo0oo4 = (o0Oo0oo) it3.next();
            if (o0oo0oo4.f29689OooO0OO.isEmpty()) {
                hashSet2.add(o0oo0oo4);
            }
        }
        while (!hashSet2.isEmpty()) {
            o0Oo0oo o0oo0oo5 = (o0Oo0oo) hashSet2.iterator().next();
            hashSet2.remove(o0oo0oo5);
            i++;
            Iterator it4 = o0oo0oo5.f29688OooO0O0.iterator();
            while (it4.hasNext()) {
                o0Oo0oo o0oo0oo6 = (o0Oo0oo) it4.next();
                o0oo0oo6.f29689OooO0OO.remove(o0oo0oo5);
                if (o0oo0oo6.f29689OooO0OO.isEmpty()) {
                    hashSet2.add(o0oo0oo6);
                }
            }
        }
        if (i == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            o0Oo0oo o0oo0oo7 = (o0Oo0oo) it5.next();
            if (!o0oo0oo7.f29689OooO0OO.isEmpty() && !o0oo0oo7.f29688OooO0O0.isEmpty()) {
                arrayList2.add(o0oo0oo7.f29687OooO00o);
            }
        }
        throw new o0O0O00("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }

    public static byte[] OooO0o0(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i = 0; i < 16; i++) {
            byte b = (byte) ((bArr[i] << 1) & 254);
            bArr2[i] = b;
            if (i < 15) {
                bArr2[i] = (byte) (((byte) ((bArr[i + 1] >> 7) & 1)) | b);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    public static final Class OooO0oO(o0ooOOo o0ooooo) {
        Class clsOooO00o = ((OooO) o0ooooo).OooO00o();
        OooOo.OooO0OO(clsOooO00o, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsOooO00o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class OooO0oo(o0ooOOo o0ooooo) {
        OooOo.OooO0o0(o0ooooo, "<this>");
        Class clsOooO00o = ((OooO) o0ooooo).OooO00o();
        if (clsOooO00o.isPrimitive()) {
            String name = clsOooO00o.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsOooO00o;
    }

    public static void OooOO0(Runnable runnable) {
        new Handler(Looper.getMainLooper()).postDelayed(runnable, 0L);
    }

    public static final o00000 OooOO0O(Socket socket) throws IOException {
        Logger logger = o000O0.f32570OooO00o;
        OooOo.OooO0o0(socket, "<this>");
        o00O0000 o00o0000 = new o00O0000(socket);
        OutputStream outputStream = socket.getOutputStream();
        OooOo.OooO0Oo(outputStream, "getOutputStream()");
        return new o00000(0, o00o0000, new o00000(1, outputStream, o00o0000));
    }

    public static final o00000O0 OooOO0o(Socket socket) throws IOException {
        Logger logger = o000O0.f32570OooO00o;
        OooOo.OooO0o0(socket, "<this>");
        o00O0000 o00o0000 = new o00O0000(socket);
        InputStream inputStream = socket.getInputStream();
        OooOo.OooO0Oo(inputStream, "getInputStream()");
        return new o00000O0(0, o00o0000, new o00000O0(1, inputStream, o00o0000));
    }

    public static o00O0O OooOOO(o00Ooo o00ooo2, int i) {
        OooOo.OooO0o0(o00ooo2, "<this>");
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (z) {
            if (o00ooo2.f31436OooOo <= 0) {
                i = -i;
            }
            return new o00O0O(o00ooo2.f31437OooOo0O, o00ooo2.f31438OooOo0o, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
    }

    public static final Object OooOOO0(o00OO000.o00Oo0 o00oo0, o00OO000.o00Oo0 o00oo02, o00O0Oo.o00O0O o00o0o) throws Throwable {
        Object o0000ooo;
        Object objOooo0oo;
        try {
            if (o00o0o instanceof OooO00o) {
                kotlin.jvm.internal.o0O0O00.OooO0O0(2, o00o0o);
                o0000ooo = o00o0o.invoke(o00oo02, o00oo0);
            } else {
                o0000ooo = Oooo0o0.OooO.OooOo0o(o00o0o, o00oo02, o00oo0);
            }
        } catch (Throwable th) {
            o0000ooo = new o0000Ooo(false, th);
        }
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        if (o0000ooo == oooOo00 || (objOooo0oo = o00oo0.Oooo0oo(o0000ooo)) == o0000OO0.f31502OooO0o0) {
            return oooOo00;
        }
        if (objOooo0oo instanceof o0000Ooo) {
            throw ((o0000Ooo) objOooo0oo).f31507OooO00o;
        }
        return o0000OO0.OooOooo(objOooo0oo);
    }

    public static o00Ooo OooOOOO(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new o00Ooo(i, i2 - 1, 1);
        }
        o00Ooo o00ooo2 = o00Ooo.f31443OooOoO0;
        return o00Ooo.f31443OooOoO0;
    }

    public static void OooOOOo(int i, Bundle bundle, Parcel parcel) {
        if (bundle == null) {
            return;
        }
        int iOooOoO = OooOoO(parcel, i);
        parcel.writeBundle(bundle);
        OooOoo(parcel, iOooOoO);
    }

    public static void OooOOo(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iOooOoO = OooOoO(parcel, i);
        parcel.writeStrongBinder(iBinder);
        OooOoo(parcel, iOooOoO);
    }

    public static void OooOOo0(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iOooOoO = OooOoO(parcel, i);
        parcel.writeByteArray(bArr);
        OooOoo(parcel, iOooOoO);
    }

    public static void OooOOoo(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iOooOoO = OooOoO(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(((Integer) list.get(i2)).intValue());
        }
        OooOoo(parcel, iOooOoO);
    }

    public static void OooOo(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int iOooOoO = OooOoO(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        OooOoo(parcel, iOooOoO);
    }

    public static void OooOo0(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int iOooOoO = OooOoO(parcel, i);
        parcel.writeString(str);
        OooOoo(parcel, iOooOoO);
    }

    public static void OooOo00(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int iOooOoO = OooOoO(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        OooOoo(parcel, iOooOoO);
    }

    public static void OooOo0O(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int iOooOoO = OooOoO(parcel, i);
        parcel.writeStringArray(strArr);
        OooOoo(parcel, iOooOoO);
    }

    public static void OooOo0o(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iOooOoO = OooOoO(parcel, i);
        parcel.writeStringList(list);
        OooOoo(parcel, iOooOoO);
    }

    public static int OooOoO(Parcel parcel, int i) {
        parcel.writeInt(i | SupportMenu.CATEGORY_MASK);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void OooOoO0(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iOooOoO = OooOoO(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        OooOoo(parcel, iOooOoO);
    }

    public static int OooOoOO(byte[] bArr, int i, ez0 ez0Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return OooOoo0(b, bArr, i2, ez0Var);
        }
        ez0Var.f18711OooO00o = b;
        return i2;
    }

    public static void OooOoo(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static int OooOoo0(int i, byte[] bArr, int i2, ez0 ez0Var) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            ez0Var.f18711OooO00o = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            ez0Var.f18711OooO00o = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            ez0Var.f18711OooO00o = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            ez0Var.f18711OooO00o = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                ez0Var.f18711OooO00o = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int OooOooO(byte[] bArr, int i, ez0 ez0Var) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            ez0Var.f18712OooO0O0 = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & 127) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & 127) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        ez0Var.f18712OooO0O0 = j2;
        return i3;
    }

    public static void OooOooo(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static int Oooo(int i, byte[] bArr, int i2, int i3, ez0 ez0Var) throws oO00O0oO {
        if ((i >>> 3) == 0) {
            throw new oO00O0oO("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return OooOooO(bArr, i2, ez0Var);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return OooOoOO(bArr, i2, ez0Var) + ez0Var.f18711OooO00o;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw new oO00O0oO("Protocol message contained an invalid tag (zero).");
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = OooOoOO(bArr, i2, ez0Var);
            i6 = ez0Var.f18711OooO00o;
            if (i6 == i5) {
                break;
            }
            i2 = Oooo(i6, bArr, i2, i3, ez0Var);
        }
        if (i2 > i3 || i6 != i5) {
            throw new oO00O0oO("Failed to parse the message.");
        }
        return i2;
    }

    public static int Oooo0(byte[] bArr, int i, ez0 ez0Var) throws oO00O0oO {
        int iOooOoOO = OooOoOO(bArr, i, ez0Var);
        int i2 = ez0Var.f18711OooO00o;
        if (i2 < 0) {
            throw new oO00O0oO("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - iOooOoOO) {
            throw new oO00O0oO("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            ez0Var.f18713OooO0OO = oO000.f26663OooOo;
            return iOooOoOO;
        }
        ez0Var.f18713OooO0OO = oO000.OooO(bArr, iOooOoOO, i2);
        return iOooOoOO + i2;
    }

    public static int Oooo000(int i, byte[] bArr) {
        int i2 = bArr[i] & ForkServer.ERROR;
        int i3 = bArr[i + 1] & ForkServer.ERROR;
        int i4 = bArr[i + 2] & ForkServer.ERROR;
        return ((bArr[i + 3] & ForkServer.ERROR) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static long Oooo00O(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static int Oooo00o(byte[] bArr, int i, ez0 ez0Var) throws oO00O0oO {
        int iOooOoOO = OooOoOO(bArr, i, ez0Var);
        int i2 = ez0Var.f18711OooO00o;
        if (i2 < 0) {
            throw new oO00O0oO("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 == 0) {
            ez0Var.f18713OooO0OO = "";
            return iOooOoOO;
        }
        int i3 = ooOOO0Oo.f26918OooO00o;
        int length = bArr.length;
        if ((((length - iOooOoOO) - i2) | iOooOoOO | i2) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iOooOoOO), Integer.valueOf(i2)));
        }
        int i4 = iOooOoOO + i2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (iOooOoOO < i4) {
            byte b = bArr[iOooOoOO];
            if (b < 0) {
                break;
            }
            iOooOoOO++;
            cArr[i5] = (char) b;
            i5++;
        }
        while (iOooOoOO < i4) {
            int i6 = iOooOoOO + 1;
            byte b2 = bArr[iOooOoOO];
            if (b2 >= 0) {
                cArr[i5] = (char) b2;
                i5++;
                iOooOoOO = i6;
                while (iOooOoOO < i4) {
                    byte b3 = bArr[iOooOoOO];
                    if (b3 >= 0) {
                        iOooOoOO++;
                        cArr[i5] = (char) b3;
                        i5++;
                    }
                }
            } else {
                if (b2 >= -32) {
                    if (b2 < -16) {
                        if (i6 >= i4 - 1) {
                            throw new oO00O0oO("Protocol message had invalid UTF-8.");
                        }
                        int i7 = i5 + 1;
                        int i8 = iOooOoOO + 2;
                        byte b4 = bArr[i6];
                        iOooOoOO += 3;
                        byte b5 = bArr[i8];
                        if (!Oooo0oO.o00000.OooOOOo(b4)) {
                            if (b2 == -32) {
                                if (b4 >= -96) {
                                    b2 = -32;
                                }
                            }
                            if (b2 == -19) {
                                if (b4 < -96) {
                                    b2 = -19;
                                }
                            }
                            if (!Oooo0oO.o00000.OooOOOo(b5)) {
                                cArr[i5] = (char) (((b4 & Utf8.REPLACEMENT_BYTE) << 6) | ((b2 & 15) << 12) | (b5 & Utf8.REPLACEMENT_BYTE));
                                i5 = i7;
                            }
                        }
                        throw new oO00O0oO("Protocol message had invalid UTF-8.");
                    }
                    if (i6 >= i4 - 2) {
                        throw new oO00O0oO("Protocol message had invalid UTF-8.");
                    }
                    byte b6 = bArr[i6];
                    int i9 = iOooOoOO + 3;
                    byte b7 = bArr[iOooOoOO + 2];
                    iOooOoOO += 4;
                    byte b8 = bArr[i9];
                    if (!Oooo0oO.o00000.OooOOOo(b6)) {
                        if ((((b6 + 112) + (b2 << 28)) >> 30) == 0 && !Oooo0oO.o00000.OooOOOo(b7) && !Oooo0oO.o00000.OooOOOo(b8)) {
                            int i10 = ((b6 & Utf8.REPLACEMENT_BYTE) << 12) | ((b2 & 7) << 18) | ((b7 & Utf8.REPLACEMENT_BYTE) << 6) | (b8 & Utf8.REPLACEMENT_BYTE);
                            cArr[i5] = (char) ((i10 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                            cArr[i5 + 1] = (char) ((i10 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + Utf8.LOG_SURROGATE_HEADER);
                            i5 += 2;
                        }
                    }
                    throw new oO00O0oO("Protocol message had invalid UTF-8.");
                }
                if (i6 >= i4) {
                    throw new oO00O0oO("Protocol message had invalid UTF-8.");
                }
                int i11 = i5 + 1;
                iOooOoOO += 2;
                byte b9 = bArr[i6];
                if (b2 < -62 || Oooo0oO.o00000.OooOOOo(b9)) {
                    throw new oO00O0oO("Protocol message had invalid UTF-8.");
                }
                cArr[i5] = (char) ((b9 & Utf8.REPLACEMENT_BYTE) | ((b2 & 31) << 6));
                i5 = i11;
            }
        }
        ez0Var.f18713OooO0OO = new String(cArr, 0, i5);
        return i4;
    }

    public static int Oooo0O0(Object obj, oO0 oo0, byte[] bArr, int i, int i2, ez0 ez0Var) throws oO00O0oO {
        int iOooOoo0 = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iOooOoo0 = OooOoo0(i3, bArr, iOooOoo0, ez0Var);
            i3 = ez0Var.f18711OooO00o;
        }
        int i4 = iOooOoo0;
        if (i3 < 0 || i3 > i2 - i4) {
            throw new oO00O0oO("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i5 = ez0Var.f18714OooO0Oo + 1;
        ez0Var.f18714OooO0Oo = i5;
        if (i5 >= 100) {
            throw new oO00O0oO("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i6 = i4 + i3;
        oo0.OooOO0(obj, bArr, i4, i6, ez0Var);
        ez0Var.f18714OooO0Oo--;
        ez0Var.f18713OooO0OO = obj;
        return i6;
    }

    public static int Oooo0OO(Object obj, oO0 oo0, byte[] bArr, int i, int i2, int i3, ez0 ez0Var) throws oO00O0oO {
        oO00o0 oo00o0 = (oO00o0) oo0;
        int i4 = ez0Var.f18714OooO0Oo + 1;
        ez0Var.f18714OooO0Oo = i4;
        if (i4 >= 100) {
            throw new oO00O0oO("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iOooOOoo = oo00o0.OooOOoo(obj, bArr, i, i2, i3, ez0Var);
        ez0Var.f18714OooO0Oo--;
        ez0Var.f18713OooO0OO = obj;
        return iOooOOoo;
    }

    public static int Oooo0o(byte[] bArr, int i, oO00O0o0 oo00o0o0, ez0 ez0Var) throws oO00O0oO {
        oO0OOo0o oo0ooo0o = (oO0OOo0o) oo00o0o0;
        int iOooOoOO = OooOoOO(bArr, i, ez0Var);
        int i2 = ez0Var.f18711OooO00o + iOooOoOO;
        while (iOooOoOO < i2) {
            iOooOoOO = OooOoOO(bArr, iOooOoOO, ez0Var);
            oo0ooo0o.OooO0oO(ez0Var.f18711OooO00o);
        }
        if (iOooOoOO == i2) {
            return iOooOoOO;
        }
        throw new oO00O0oO("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int Oooo0o0(int i, byte[] bArr, int i2, int i3, oO00O0o0 oo00o0o0, ez0 ez0Var) {
        oO0OOo0o oo0ooo0o = (oO0OOo0o) oo00o0o0;
        int iOooOoOO = OooOoOO(bArr, i2, ez0Var);
        oo0ooo0o.OooO0oO(ez0Var.f18711OooO00o);
        while (iOooOoOO < i3) {
            int iOooOoOO2 = OooOoOO(bArr, iOooOoOO, ez0Var);
            if (i != ez0Var.f18711OooO00o) {
                break;
            }
            iOooOoOO = OooOoOO(bArr, iOooOoOO2, ez0Var);
            oo0ooo0o.OooO0oO(ez0Var.f18711OooO00o);
        }
        return iOooOoOO;
    }

    public static int Oooo0oO(oO0 oo0, int i, byte[] bArr, int i2, int i3, oO00O0o0 oo00o0o0, ez0 ez0Var) throws oO00O0oO {
        ooOOOOoo ooooooooZza = oo0.zza();
        oO0 oo02 = oo0;
        byte[] bArr2 = bArr;
        int i4 = i3;
        ez0 ez0Var2 = ez0Var;
        int iOooo0O0 = Oooo0O0(ooooooooZza, oo02, bArr2, i2, i4, ez0Var2);
        oo02.OooO0oo(ooooooooZza);
        ez0Var2.f18713OooO0OO = ooooooooZza;
        oo00o0o0.add(ooooooooZza);
        while (iOooo0O0 < i4) {
            ez0 ez0Var3 = ez0Var2;
            int i5 = i4;
            int iOooOoOO = OooOoOO(bArr2, iOooo0O0, ez0Var3);
            if (i != ez0Var3.f18711OooO00o) {
                break;
            }
            byte[] bArr3 = bArr2;
            oO0 oo03 = oo02;
            ooOOOOoo ooooooooZza2 = oo03.zza();
            iOooo0O0 = Oooo0O0(ooooooooZza2, oo03, bArr3, iOooOoOO, i5, ez0Var3);
            oo02 = oo03;
            bArr2 = bArr3;
            i4 = i5;
            ez0Var2 = ez0Var3;
            oo02.OooO0oo(ooooooooZza2);
            ez0Var2.f18713OooO0OO = ooooooooZza2;
            oo00o0o0.add(ooooooooZza2);
        }
        return iOooo0O0;
    }

    public static int Oooo0oo(int i, byte[] bArr, int i2, int i3, oO0O00oO oo0o00oo, ez0 ez0Var) throws oO00O0oO {
        if ((i >>> 3) == 0) {
            throw new oO00O0oO("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iOooOooO = OooOooO(bArr, i2, ez0Var);
            oo0o00oo.OooO0Oo(i, Long.valueOf(ez0Var.f18712OooO0O0));
            return iOooOooO;
        }
        if (i4 == 1) {
            oo0o00oo.OooO0Oo(i, Long.valueOf(Oooo00O(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iOooOoOO = OooOoOO(bArr, i2, ez0Var);
            int i5 = ez0Var.f18711OooO00o;
            if (i5 < 0) {
                throw new oO00O0oO("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 > bArr.length - iOooOoOO) {
                throw new oO00O0oO("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i5 == 0) {
                oo0o00oo.OooO0Oo(i, oO000.f26663OooOo);
            } else {
                oo0o00oo.OooO0Oo(i, oO000.OooO(bArr, iOooOoOO, i5));
            }
            return iOooOoOO + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new oO00O0oO("Protocol message contained an invalid tag (zero).");
            }
            oo0o00oo.OooO0Oo(i, Integer.valueOf(Oooo000(i2, bArr)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        oO0O00oO oo0o00ooOooO00o = oO0O00oO.OooO00o();
        int i7 = ez0Var.f18714OooO0Oo + 1;
        ez0Var.f18714OooO0Oo = i7;
        if (i7 >= 100) {
            throw new oO00O0oO("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iOooOoOO2 = OooOoOO(bArr, i2, ez0Var);
            int i9 = ez0Var.f18711OooO00o;
            if (i9 == i6) {
                i8 = i9;
                i2 = iOooOoOO2;
                break;
            }
            i2 = Oooo0oo(i9, bArr, iOooOoOO2, i3, oo0o00ooOooO00o, ez0Var);
            i8 = i9;
        }
        ez0Var.f18714OooO0Oo--;
        if (i2 > i3 || i8 != i6) {
            throw new oO00O0oO("Failed to parse the message.");
        }
        oo0o00oo.OooO0Oo(i, oo0o00ooOooO00o);
        return i2;
    }
}
