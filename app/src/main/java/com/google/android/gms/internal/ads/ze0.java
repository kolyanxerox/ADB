package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import android.webkit.WebView;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.ironsource.C3034d9;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import io.flutter.embedding.android.KeyboardMap;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.regex.Pattern;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.metadata.TikaCoreProperties;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class ze0 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f26160OooO00o;

    /* renamed from: OooO0O0 */
    public static final be0 f26155OooO0O0 = new be0(8);

    /* renamed from: OooO0OO */
    public static final be0 f26156OooO0OO = new be0(10);

    /* renamed from: OooO0Oo */
    public static final o0000o0.OooOOO f26157OooO0Oo = new o0000o0.OooOOO(5);

    /* renamed from: OooO0o0 */
    public static final mr0 f26159OooO0o0 = new mr0(7);

    /* renamed from: OooO0o */
    public static final lu0 f26158OooO0o = new lu0(os0.class, pq0.class, new el0(18));

    public /* synthetic */ ze0(int i) {
        this.f26160OooO00o = i;
    }

    public static void OooO(Context context, boolean z) {
        if (z) {
            zzo.zzi("This request is sent from a test device.");
            return;
        }
        zzbc.zzb();
        zzo.zzi("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + zzf.zzy(context) + "\")) to get test ads on this device.");
    }

    public static double OooO00o(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        int i = bArr[0] << 24;
        int i2 = bArr[1] << 16;
        int i3 = bArr[2] << 8;
        return ((((i & ViewCompat.MEASURED_STATE_MASK) | (i2 & 16711680)) | (65280 & i3)) | (bArr[3] & ForkServer.ERROR)) / 1.073741824E9d;
    }

    public static float OooO0O0(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static int OooO0OO(int i) {
        int i2 = 0;
        while (i > 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    public static int OooO0Oo(SQLiteDatabase sQLiteDatabase, int i) {
        int i2 = 0;
        if (i == 2) {
            return 0;
        }
        Cursor cursorOoooO = OoooO(sQLiteDatabase, i);
        if (cursorOoooO.getCount() > 0) {
            cursorOoooO.moveToNext();
            i2 = cursorOoooO.getInt(cursorOoooO.getColumnIndexOrThrow("value"));
        }
        cursorOoooO.close();
        return i2;
    }

    public static zzs OooO0o(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ld0 ld0Var = (ld0) it.next();
            if (ld0Var.f20853OooO0OO) {
                arrayList.add(AdSize.FLUID);
            } else {
                arrayList.add(new AdSize(ld0Var.f20851OooO00o, ld0Var.f20852OooO0O0));
            }
        }
        return new zzs(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }

    public static long OooO0o0(int i, long j) {
        if (i == 1) {
            return j;
        }
        int i2 = i >> 1;
        long j2 = (j * j) % 1073807359;
        return (i & 1) == 0 ? OooO0o0(i2, j2) % 1073807359 : ((OooO0o0(i2, j2) % 1073807359) * j) % 1073807359;
    }

    public static jf0 OooO0oO(Context context, int i) {
        boolean zBooleanValue;
        if (nf0.OooO00o()) {
            int i2 = i - 2;
            if (i2 != 20 && i2 != 21) {
                switch (i2) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        zBooleanValue = ((Boolean) AbstractC1449c8.f17950OooO0OO.OooOOO()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        zBooleanValue = ((Boolean) AbstractC1449c8.f17951OooO0Oo.OooOOO()).booleanValue();
                        break;
                    case 5:
                        zBooleanValue = ((Boolean) AbstractC1449c8.f17949OooO0O0.OooOOO()).booleanValue();
                        break;
                }
            } else {
                zBooleanValue = ((Boolean) AbstractC1449c8.f17952OooO0o0.OooOOO()).booleanValue();
            }
            if (zBooleanValue) {
                return new kf0(context, i);
            }
        }
        return new yf0();
    }

    public static HashMap OooO0oo(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return (HashMap) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str.getBytes(), 0))).readObject();
        } catch (IOException | ClassNotFoundException unused) {
            Log.d("ze0", "decode object failure");
            return null;
        }
    }

    public static void OooOO0(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void OooOO0O(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            AbstractC1641hg.OooOOO0("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }

    public static void OooOO0o(o0o0000 o0o0000Var, OooOOOO.OooO0O0 oooO0O0) {
        for (int i = 0; i < o0o0000Var.zza(); i++) {
            long jZzb = o0o0000Var.zzb(i);
            ArrayList arrayListOooO0Oo = o0o0000Var.OooO0Oo(jZzb);
            if (!arrayListOooO0Oo.isEmpty()) {
                if (i == o0o0000Var.zza() - 1) {
                    throw new IllegalStateException();
                }
                long jZzb2 = o0o0000Var.zzb(i + 1) - o0o0000Var.zzb(i);
                if (jZzb2 > 0) {
                    oooO0O0.mo13701zza(new o0OOo000(arrayListOooO0Oo, jZzb, jZzb2));
                }
            }
        }
    }

    public static void OooOOO(Exception exc, String str) {
        Log.e("OMIDLIB", str, exc);
    }

    public static void OooOOO0(C1669i7 c1669i7, C1558f7 c1558f7, String... strArr) {
        if (c1558f7 == null) {
            return;
        }
        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
        c1669i7.OooO0OO(c1558f7, SystemClock.elapsedRealtime(), strArr);
    }

    public static void OooOOOO(String str) {
        if (((Boolean) AbstractC1928p8.f23240OooO00o.OooOOO()).booleanValue()) {
            zzo.zze(str);
        }
    }

    public static void OooOOOo(String str, boolean z) throws C1510dx {
        if (!z) {
            throw new C1510dx(str);
        }
    }

    public static X509Certificate[][] OooOOo(String str) throws IOException {
        Pair pairOoooOoo;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
        try {
            if (randomAccessFile.length() < 22) {
                pairOoooOoo = null;
            } else {
                pairOoooOoo = af0.OoooOoo(randomAccessFile, 0);
                if (pairOoooOoo == null) {
                    pairOoooOoo = af0.OoooOoo(randomAccessFile, 65535);
                }
            }
            if (pairOoooOoo == null) {
                throw new oOO0O00O("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            }
            ByteBuffer byteBuffer = (ByteBuffer) pairOoooOoo.first;
            long jLongValue = ((Long) pairOoooOoo.second).longValue();
            long j = jLongValue - 20;
            if (j >= 0) {
                randomAccessFile.seek(j);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new oOO0O00O("ZIP64 APK not supported");
                }
            }
            af0.Oooooo(byteBuffer);
            long j2 = byteBuffer.getInt(byteBuffer.position() + 16) & KeyboardMap.kValueMask;
            if (j2 >= jLongValue) {
                throw new oOO0O00O("ZIP Central Directory offset out of range: " + j2 + ". ZIP End of Central Directory offset: " + jLongValue);
            }
            af0.Oooooo(byteBuffer);
            if ((byteBuffer.getInt(byteBuffer.position() + 12) & KeyboardMap.kValueMask) + j2 != jLongValue) {
                throw new oOO0O00O("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (j2 < 32) {
                throw new oOO0O00O("APK too small for APK Signing Block. ZIP Central Directory offset: " + j2);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferAllocate.order(byteOrder);
            randomAccessFile.seek(j2 - byteBufferAllocate.capacity());
            randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
            if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                throw new oOO0O00O("No APK Signing Block before ZIP Central Directory");
            }
            long j3 = byteBufferAllocate.getLong(0);
            long j4 = j2;
            if (j3 < byteBufferAllocate.capacity() || j3 > 2147483639) {
                throw new oOO0O00O("APK Signing Block size out of range: " + j3);
            }
            int i = (int) (8 + j3);
            long j5 = j4 - i;
            if (j5 < 0) {
                throw new oOO0O00O("APK Signing Block offset out of range: " + j5);
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i);
            byteBufferAllocate2.order(byteOrder);
            randomAccessFile.seek(j5);
            randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
            long j6 = byteBufferAllocate2.getLong(0);
            if (j6 != j3) {
                throw new oOO0O00O("APK Signing Block sizes in header and footer do not match: " + j6 + " vs " + j3);
            }
            Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j5));
            ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
            long jLongValue2 = ((Long) pairCreate.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int iCapacity = byteBuffer2.capacity() - 24;
            if (iCapacity < 8) {
                throw new IllegalArgumentException("end < start: " + iCapacity + " < 8");
            }
            int iCapacity2 = byteBuffer2.capacity();
            if (iCapacity > byteBuffer2.capacity()) {
                throw new IllegalArgumentException("end > capacity: " + iCapacity + " > " + iCapacity2);
            }
            int iLimit = byteBuffer2.limit();
            int iPosition = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(iCapacity);
                byteBuffer2.position(8);
                ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferSlice.order(byteBuffer2.order());
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                int i2 = 0;
                while (byteBufferSlice.hasRemaining()) {
                    i2++;
                    if (byteBufferSlice.remaining() < 8) {
                        throw new oOO0O00O("Insufficient data to read size of APK Signing Block entry #" + i2);
                    }
                    long j7 = byteBufferSlice.getLong();
                    if (j7 < 4 || j7 > 2147483647L) {
                        throw new oOO0O00O("APK Signing Block entry #" + i2 + " size out of range: " + j7);
                    }
                    int i3 = (int) j7;
                    int iPosition2 = byteBufferSlice.position() + i3;
                    if (i3 > byteBufferSlice.remaining()) {
                        throw new oOO0O00O("APK Signing Block entry #" + i2 + " size out of range: " + i3 + ", available: " + byteBufferSlice.remaining());
                    }
                    if (byteBufferSlice.getInt() == 1896449818) {
                        X509Certificate[][] x509CertificateArrOoooo00 = Ooooo00(randomAccessFile.getChannel(), new oOO0O000(OoooO00(i3 - 4, byteBufferSlice), jLongValue2, j4, jLongValue, byteBuffer));
                        randomAccessFile.close();
                        return x509CertificateArrOoooo00;
                    }
                    long j8 = jLongValue2;
                    long j9 = jLongValue;
                    long j10 = j4;
                    ByteBuffer byteBuffer3 = byteBuffer;
                    byteBufferSlice.position(iPosition2);
                    jLongValue = j9;
                    byteBuffer = byteBuffer3;
                    j4 = j10;
                    jLongValue2 = j8;
                }
                throw new oOO0O00O("No APK Signature Scheme v2 block in APK Signing Block");
            } catch (Throwable th) {
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                throw th;
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void OooOOo0(o00000oO.OooOOO oooOOO, String str) {
        tq0 tq0Var = new tq0(str, 4);
        oooOOO.addListener(new wp0(0, oooOOO, tq0Var), AbstractC2200wl.f25327OooO0oO);
    }

    public static double OooOOoo(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        int i = bArr[0] << 24;
        int i2 = bArr[1] << 16;
        int i3 = bArr[2] << 8;
        return ((((i & ViewCompat.MEASURED_STATE_MASK) | (i2 & 16711680)) | (65280 & i3)) | (bArr[3] & ForkServer.ERROR)) / 65536.0d;
    }

    public static C2249xx OooOo(r40 r40Var) {
        r40Var.OooOO0O(1);
        int iOooOo = r40Var.OooOo();
        long j = r40Var.f23746OooO0O0;
        long j2 = iOooOo;
        int i = iOooOo / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long jOooOoo = r40Var.OooOoo();
            if (jOooOoo == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jOooOoo;
            jArrCopyOf2[i2] = r40Var.OooOoo();
            r40Var.OooOO0O(2);
            i2++;
        }
        r40Var.OooOO0O((int) ((j + j2) - r40Var.f23746OooO0O0));
        return new C2249xx(2, jArrCopyOf, jArrCopyOf2);
    }

    public static long OooOo0(r40 r40Var, int i, int i2) {
        r40Var.OooOO0(i);
        if (r40Var.OooOOOO() < 5) {
            return -9223372036854775807L;
        }
        int iOooOOo0 = r40Var.OooOOo0();
        if ((8388608 & iOooOOo0) != 0 || ((iOooOOo0 >> 8) & 8191) != i2 || (iOooOOo0 & 32) == 0 || r40Var.OooOo0O() < 7 || r40Var.OooOOOO() < 7 || (r40Var.OooOo0O() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        r40Var.OooO0o(bArr, 0, 6);
        long j = bArr[0];
        long j2 = bArr[1];
        long j3 = bArr[2];
        long j4 = bArr[3] & 255;
        return ((j & 255) << 25) | ((j2 & 255) << 17) | ((j3 & 255) << 9) | (j4 + j4) | ((bArr[4] & 255) >> 7);
    }

    public static int OooOo00(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        throw new IllegalArgumentException(OooO0oO.OooOo.OooO0o(i, "Unknown content digest algorthm: "));
    }

    public static long OooOo0O(String str) {
        int i = i80.f19994OooO00o;
        String[] strArrSplit = str.split("\\.", 2);
        long j = 0;
        for (String str2 : strArrSplit[0].split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, -1)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (strArrSplit.length == 2) {
            j2 += Long.parseLong(strArrSplit[1]);
        }
        return j2 * 1000;
    }

    public static C2107u2 OooOo0o(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = i80.f19994OooO00o;
            String[] strArrSplit = str.split(C3034d9.i.f8173b, 2);
            if (strArrSplit.length != 2) {
                AbstractC1641hg.OooOOo0("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(o00OO0O0.OooO00o(new r40(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e) {
                    AbstractC1641hg.OooOOoo("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new o0O000Oo(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C2107u2(arrayList);
    }

    public static String OooOoO(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            zzo.zzg("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i4 = i3 - 1;
            if (i >= i4) {
                sb.append(strArr[i4]);
                return sb.toString();
            }
            sb.append(strArr[i]);
            sb.append(' ');
            i++;
        }
    }

    public static jf0 OooOoO0(Context context, int i, int i2, zzm zzmVar) {
        boolean zMatches;
        jf0 jf0VarOooO0oO = OooO0oO(context, i);
        if (jf0VarOooO0oO instanceof kf0) {
            jf0VarOooO0oO.zzi();
            jf0VarOooO0oO.OooO0O0(i2);
            jf0VarOooO0oO.OooO00o(zzaa.zza(zzmVar.zzm));
            String str = zzmVar.zzp;
            if (TextUtils.isEmpty(str)) {
                zMatches = false;
            } else {
                zMatches = Pattern.matches((String) zzbe.zzc().OooO00o(AbstractC1448c7.o0OO0ooO), str);
            }
            if (zMatches) {
                jf0VarOooO0oO.zze(zzmVar.zzp);
            }
        }
        return jf0VarOooO0oO;
    }

    public static void OooOoo(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(OooO0oO.OooOo.OooO0o(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static void OooOoo0(int i, String str, Throwable th) {
        zzo.zzi("Ad failed to load : " + i);
        zze.zzb(str, th);
        if (i == 3) {
            return;
        }
        zzv.zzp().OooO0oO(str, th);
    }

    public static void OooOooO(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    public static void OooOooo(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            for (Object obj : objArr) {
                if (obj == null) {
                    sb.append("null");
                } else if (obj instanceof String) {
                    String string = obj.toString();
                    if (string.startsWith("{")) {
                        sb.append(string);
                    } else {
                        sb.append('\"');
                        sb.append(string);
                        sb.append('\"');
                    }
                } else {
                    sb.append(obj);
                }
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
            sb.append(")}");
            String string2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler == null || Looper.myLooper() == handler.getLooper()) {
                OoooOoO(webView, string2);
            } else {
                handler.post(new c60(9, webView, string2));
            }
        }
    }

    public static long Oooo(String[] strArr, int i) {
        long jOooO0OO = (af0.OooO0OO(strArr[0]) + 2147483647L) % 1073807359;
        for (int i2 = 1; i2 < i; i2++) {
            jOooO0OO = (((af0.OooO0OO(strArr[i2]) + 2147483647L) % 1073807359) + ((jOooO0OO * 16785407) % 1073807359)) % 1073807359;
        }
        return jOooO0OO;
    }

    public static p80 Oooo0(r40 r40Var, boolean z, boolean z2) throws C2185w6 {
        if (z) {
            Oooo0oO(3, r40Var, false);
        }
        r40Var.OooO0O0((int) r40Var.OooOoo0(), StandardCharsets.UTF_8);
        long jOooOoo0 = r40Var.OooOoo0();
        String[] strArr = new String[(int) jOooOoo0];
        for (int i = 0; i < jOooOoo0; i++) {
            strArr[i] = r40Var.OooO0O0((int) r40Var.OooOoo0(), StandardCharsets.UTF_8);
        }
        if (z2 && (r40Var.OooOo0O() & 1) == 0) {
            throw C2185w6.OooO00o(null, "framing bit expected to be set");
        }
        return new p80(strArr, 1);
    }

    public static void Oooo000(InterfaceC1711jd interfaceC1711jd, JSONObject jSONObject) {
        StringBuilder sbOooOoO0 = OooO0oO.OooOo.OooOoO0("(window.AFMA_ReceiveMessage || function() {})('openIntentAsync',", jSONObject.toString(), ");");
        zzo.zze("Dispatching AFMA event: ".concat(sbOooOoO0.toString()));
        interfaceC1711jd.zza(sbOooOoO0.toString());
    }

    public static void Oooo00O(String str, boolean z) throws C2185w6 {
        if (!z) {
            throw C2185w6.OooO00o(null, str);
        }
    }

    public static int Oooo00o(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case InputDeviceCompat.SOURCE_KEYBOARD /* 257 */:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
        }
    }

    public static void Oooo0O0(SQLiteDatabase sQLiteDatabase, long j, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(j));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new String[]{String.valueOf(j)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        }
    }

    public static void Oooo0OO(ArrayList arrayList, oOo0o00 ooo0o00) {
        String str = (String) ooo0o00.OooOOO();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        arrayList.add(str);
    }

    public static void Oooo0o(int i, long j, String str, int i2, PriorityQueue priorityQueue) {
        C1960q3 c1960q3 = new C1960q3(i2, j, str);
        if ((priorityQueue.size() != i || (((C1960q3) priorityQueue.peek()).f23497OooO0OO <= i2 && ((C1960q3) priorityQueue.peek()).f23495OooO00o <= j)) && !priorityQueue.contains(c1960q3)) {
            priorityQueue.add(c1960q3);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    public static String Oooo0o0(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(OooO0oO.OooOo.OooO0o(i, "Unknown content digest algorthm: "));
    }

    public static boolean Oooo0oO(int i, r40 r40Var, boolean z) throws C2185w6 {
        if (r40Var.OooOOOO() < 7) {
            if (z) {
                return false;
            }
            throw C2185w6.OooO00o(null, "too short header: " + r40Var.OooOOOO());
        }
        if (r40Var.OooOo0O() != i) {
            if (z) {
                return false;
            }
            throw C2185w6.OooO00o(null, "expected header type ".concat(String.valueOf(Integer.toHexString(i))));
        }
        if (r40Var.OooOo0O() == 118 && r40Var.OooOo0O() == 111 && r40Var.OooOo0O() == 114 && r40Var.OooOo0O() == 98 && r40Var.OooOo0O() == 105 && r40Var.OooOo0O() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw C2185w6.OooO00o(null, "expected characters 'vorbis'");
    }

    public static long Oooo0oo(ByteBuffer byteBuffer) {
        long j = byteBuffer.getInt();
        return j < 0 ? j + 4294967296L : j;
    }

    public static Cursor OoooO(SQLiteDatabase sQLiteDatabase, int i) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i == 0) {
            strArr2[0] = "failed_requests";
        } else if (i == 1) {
            strArr2[0] = "total_requests";
        } else if (i != 2) {
            strArr2[0] = "completed_requests";
        } else {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    public static long OoooO0(ByteBuffer byteBuffer) {
        long jOooo0oo = Oooo0oo(byteBuffer) << 32;
        if (jOooo0oo >= 0) {
            return Oooo0oo(byteBuffer) + jOooo0oo;
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static ByteBuffer OoooO00(int i, ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (i2 < iPosition || i2 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static ByteBuffer OoooO0O(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException(OooO0oO.OooOo.OooO0o(byteBuffer.remaining(), "Remaining buffer too short to contain length of length-prefixed field. Remaining: "));
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            return OoooO00(i, byteBuffer);
        }
        throw new IOException(OooO0oO.OooOo.OooO0o0(i, byteBuffer.remaining(), "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: "));
    }

    public static void OoooOO0(int i, byte[] bArr) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    public static void OoooOOO(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }

    public static byte[] OoooOOo(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        }
        if (i > byteBuffer.remaining()) {
            throw new IOException(OooO0oO.OooOo.OooO0o0(i, byteBuffer.remaining(), "Underflow while reading length-prefixed value. Length: ", ", available: "));
        }
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static X509Certificate[] OoooOo0(ByteBuffer byteBuffer, HashMap map, CertificateFactory certificateFactory) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, InvalidAlgorithmParameterException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferOoooO0O = OoooO0O(byteBuffer);
        ByteBuffer byteBufferOoooO0O2 = OoooO0O(byteBuffer);
        byte[] bArrOoooOOo = OoooOOo(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrOoooOOo2 = null;
        byte[] bArrOoooOOo3 = null;
        int i = -1;
        int i2 = 0;
        while (byteBufferOoooO0O2.hasRemaining()) {
            i2++;
            try {
                ByteBuffer byteBufferOoooO0O3 = OoooO0O(byteBufferOoooO0O2);
                if (byteBufferOoooO0O3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i3 = byteBufferOoooO0O3.getInt();
                arrayList.add(Integer.valueOf(i3));
                if (i3 != 513 && i3 != 514 && i3 != 769) {
                    switch (i3) {
                        case InputDeviceCompat.SOURCE_KEYBOARD /* 257 */:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i != -1) {
                    int iOooo00o = Oooo00o(i3);
                    int iOooo00o2 = Oooo00o(i);
                    if (iOooo00o != 1 && iOooo00o2 == 1) {
                    }
                }
                bArrOoooOOo3 = OoooOOo(byteBufferOoooO0O3);
                i = i3;
            } catch (IOException e) {
                e = e;
                throw new SecurityException(OooO0oO.OooOo.OooO0o(i2, "Failed to parse signature record #"), e);
            } catch (BufferUnderflowException e2) {
                e = e2;
                throw new SecurityException(OooO0oO.OooOo.OooO0o(i2, "Failed to parse signature record #"), e);
            }
        }
        if (i == -1) {
            if (i2 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i == 513 || i == 514) {
            str = "EC";
        } else if (i != 769) {
            switch (i) {
                case InputDeviceCompat.SOURCE_KEYBOARD /* 257 */:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
            }
        } else {
            str = "DSA";
        }
        if (i == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i != 769) {
            switch (i) {
                case InputDeviceCompat.SOURCE_KEYBOARD /* 257 */:
                    pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    pairCreate = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    pairCreate = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrOoooOOo));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferOoooO0O);
            if (!signature.verify(bArrOoooOOo3)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferOoooO0O.clear();
            ByteBuffer byteBufferOoooO0O4 = OoooO0O(byteBufferOoooO0O);
            ArrayList arrayList2 = new ArrayList();
            int i4 = 0;
            while (byteBufferOoooO0O4.hasRemaining()) {
                i4++;
                try {
                    ByteBuffer byteBufferOoooO0O5 = OoooO0O(byteBufferOoooO0O4);
                    if (byteBufferOoooO0O5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i5 = byteBufferOoooO0O5.getInt();
                    arrayList2.add(Integer.valueOf(i5));
                    if (i5 == i) {
                        bArrOoooOOo2 = OoooOOo(byteBufferOoooO0O5);
                    }
                } catch (IOException e3) {
                    e = e3;
                    throw new IOException(OooO0oO.OooOo.OooO0o(i4, "Failed to parse digest record #"), e);
                } catch (BufferUnderflowException e4) {
                    e = e4;
                    throw new IOException(OooO0oO.OooOo.OooO0o(i4, "Failed to parse digest record #"), e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iOooo00o3 = Oooo00o(i);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iOooo00o3), bArrOoooOOo2);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrOoooOOo2)) {
                throw new SecurityException(Oooo0o0(iOooo00o3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferOoooO0O6 = OoooO0O(byteBufferOoooO0O);
            ArrayList arrayList3 = new ArrayList();
            int i6 = 0;
            while (byteBufferOoooO0O6.hasRemaining()) {
                i6++;
                byte[] bArrOoooOOo4 = OoooOOo(byteBufferOoooO0O6);
                try {
                    arrayList3.add(new oOO0O0((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrOoooOOo4)), bArrOoooOOo4));
                } catch (CertificateException e5) {
                    throw new SecurityException(OooO0oO.OooOo.OooO0o(i6, "Failed to decode certificate #"), e5);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrOoooOOo, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e6) {
            e = e6;
            throw new SecurityException(OooO0oO.OooOo.OooOO0O("Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeyException e7) {
            e = e7;
            throw new SecurityException(OooO0oO.OooOo.OooOO0O("Failed to verify ", str2, " signature"), e);
        } catch (NoSuchAlgorithmException e8) {
            e = e8;
            throw new SecurityException(OooO0oO.OooOo.OooOO0O("Failed to verify ", str2, " signature"), e);
        } catch (SignatureException e9) {
            e = e9;
            throw new SecurityException(OooO0oO.OooOo.OooOO0O("Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeySpecException e10) {
            e = e10;
            throw new SecurityException(OooO0oO.OooOo.OooOO0O("Failed to verify ", str2, " signature"), e);
        }
    }

    public static final void OoooOoO(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            webView.evaluateJavascript(str, null);
        } catch (IllegalStateException unused) {
            webView.loadUrl("javascript: ".concat(String.valueOf(str)));
        }
    }

    public static byte[][] OoooOoo(int[] iArr, ooooO000[] ooooo000Arr) throws DigestException {
        long j;
        int i;
        int length;
        char c;
        int i2 = 0;
        long jZza = 0;
        while (true) {
            j = 1048576;
            if (i2 >= 3) {
                break;
            }
            jZza += (ooooo000Arr[i2].zza() + 1048575) / 1048576;
            i2++;
        }
        if (jZza >= 2097151) {
            throw new DigestException(OooO0oO.OooOo.OooO0oo(jZza, "Too many chunks: "));
        }
        byte[][] bArr = new byte[iArr.length][];
        int i3 = 0;
        while (true) {
            length = iArr.length;
            c = 5;
            if (i3 >= length) {
                break;
            }
            int i4 = (int) jZza;
            byte[] bArr2 = new byte[(OooOo00(iArr[i3]) * i4) + 5];
            bArr2[0] = 90;
            OoooOO0(i4, bArr2);
            bArr[i3] = bArr2;
            i3++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            String strOooo0o0 = Oooo0o0(iArr[i5]);
            try {
                messageDigestArr[i5] = MessageDigest.getInstance(strOooo0o0);
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(strOooo0o0.concat(" digest not supported"), e);
            }
        }
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (i = 3; i6 < i; i = 3) {
            ooooO000 ooooo000 = ooooo000Arr[i6];
            int i9 = i6;
            long jZza2 = ooooo000.zza();
            long j2 = 0;
            while (jZza2 > 0) {
                char c2 = c;
                int i10 = i7;
                int iMin = (int) Math.min(jZza2, j);
                OoooOO0(iMin, bArr3);
                for (int i11 = 0; i11 < length; i11++) {
                    messageDigestArr[i11].update(bArr3);
                }
                try {
                    ooooo000.OooO00o(messageDigestArr, j2, iMin);
                    int i12 = 0;
                    while (i12 < iArr.length) {
                        int i13 = iArr[i12];
                        byte[] bArr4 = bArr[i12];
                        int iOooOo00 = OooOo00(i13);
                        ooooO000 ooooo0002 = ooooo000;
                        MessageDigest messageDigest = messageDigestArr[i12];
                        long j3 = jZza2;
                        int iDigest = messageDigest.digest(bArr4, (i10 * iOooOo00) + 5, iOooOo00);
                        if (iDigest != iOooOo00) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                        }
                        i12++;
                        ooooo000 = ooooo0002;
                        jZza2 = j3;
                    }
                    ooooO000 ooooo0003 = ooooo000;
                    long j4 = iMin;
                    j2 += j4;
                    jZza2 -= j4;
                    i7 = i10 + 1;
                    c = c2;
                    ooooo000 = ooooo0003;
                    j = 1048576;
                } catch (IOException e2) {
                    throw new DigestException(OooO0oO.OooOo.OooO0o0(i10, i8, "Failed to digest chunk #", " of section #"), e2);
                }
            }
            i8++;
            i6 = i9 + 1;
            j = 1048576;
        }
        byte[][] bArr5 = new byte[iArr.length][];
        for (int i14 = 0; i14 < iArr.length; i14++) {
            int i15 = iArr[i14];
            byte[] bArr6 = bArr[i14];
            String strOooo0o02 = Oooo0o0(i15);
            try {
                bArr5[i14] = MessageDigest.getInstance(strOooo0o02).digest(bArr6);
            } catch (NoSuchAlgorithmException e3) {
                throw new RuntimeException(strOooo0o02.concat(" digest not supported"), e3);
            }
        }
        return bArr5;
    }

    public static X509Certificate[][] Ooooo00(FileChannel fileChannel, oOO0O000 ooo0o000) throws CertificateException {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            try {
                ByteBuffer byteBufferOoooO0O = OoooO0O((ByteBuffer) ooo0o000.f22798OooO0Oo);
                int i = 0;
                while (byteBufferOoooO0O.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(OoooOo0(OoooO0O(byteBufferOoooO0O), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException(OooO0oO.OooOo.OooO0oO(i, "Failed to parse/verify signer #", " block"), e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No digests provided");
                }
                long j = ooo0o000.f22795OooO00o;
                oOO0 ooo0 = new oOO0(fileChannel, 0L, j);
                long j2 = ooo0o000.f22797OooO0OO;
                long j3 = ooo0o000.f22796OooO0O0;
                oOO0 ooo02 = new oOO0(fileChannel, j3, j2 - j3);
                ByteBuffer byteBufferDuplicate = ((ByteBuffer) ooo0o000.f22799OooO0o0).duplicate();
                byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                af0.Oooooo(byteBufferDuplicate);
                int iPosition = byteBufferDuplicate.position() + 16;
                if (j < 0 || j > KeyboardMap.kValueMask) {
                    throw new IllegalArgumentException(OooO0oO.OooOo.OooO0oo(j, "uint32 value of out range: "));
                }
                byteBufferDuplicate.putInt(byteBufferDuplicate.position() + iPosition, (int) j);
                wj0 wj0Var = new wj0(byteBufferDuplicate);
                int size = map.size();
                int[] iArr = new int[size];
                Iterator it = map.keySet().iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    iArr[i2] = ((Integer) it.next()).intValue();
                    i2++;
                }
                try {
                    byte[][] bArrOoooOoo = OoooOoo(iArr, new ooooO000[]{ooo0, ooo02, wj0Var});
                    for (int i3 = 0; i3 < size; i3++) {
                        int i4 = iArr[i3];
                        if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i4)), bArrOoooOoo[i3])) {
                            throw new SecurityException(Oooo0o0(i4).concat(" digest of contents did not verify"));
                        }
                    }
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } catch (DigestException e2) {
                    throw new SecurityException("Failed to compute digest(s) of contents", e2);
                }
            } catch (IOException e3) {
                throw new SecurityException("Failed to read list of signers", e3);
            }
        } catch (CertificateException e4) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e4);
        }
    }

    public static void o000oOoO(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    public abstract HashMap OooOoOO();

    public String toString() throws IOException {
        switch (this.f26160OooO00o) {
            case 13:
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(OooOoOO());
                    objectOutputStream.close();
                    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                } catch (IOException unused) {
                    return null;
                }
            default:
                return super.toString();
        }
    }
}
