package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class O0O0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public long f16768OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f16769OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Serializable f16770OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f16771OooO0Oo;

    public O0O0(long j, String str, String str2, int i) {
        this.f16768OooO00o = j;
        this.f16770OooO0OO = str;
        this.f16771OooO0Oo = str2;
        this.f16769OooO0O0 = i;
    }

    public static void OooO(BufferedOutputStream bufferedOutputStream, long j) throws IOException {
        bufferedOutputStream.write((byte) j);
        bufferedOutputStream.write((byte) (j >>> 8));
        bufferedOutputStream.write((byte) (j >>> 16));
        bufferedOutputStream.write((byte) (j >>> 24));
        bufferedOutputStream.write((byte) (j >>> 32));
        bufferedOutputStream.write((byte) (j >>> 40));
        bufferedOutputStream.write((byte) (j >>> 48));
        bufferedOutputStream.write((byte) (j >>> 56));
    }

    public static int OooO0Oo(oo00 oo00Var) {
        return (OooOO0o(oo00Var) << 24) | OooOO0o(oo00Var) | (OooOO0o(oo00Var) << 8) | (OooOO0o(oo00Var) << 16);
    }

    public static long OooO0o0(oo00 oo00Var) {
        return (OooOO0o(oo00Var) & 255) | ((OooOO0o(oo00Var) & 255) << 8) | ((OooOO0o(oo00Var) & 255) << 16) | ((OooOO0o(oo00Var) & 255) << 24) | ((OooOO0o(oo00Var) & 255) << 32) | ((OooOO0o(oo00Var) & 255) << 40) | ((OooOO0o(oo00Var) & 255) << 48) | ((OooOO0o(oo00Var) & 255) << 56);
    }

    public static String OooO0oO(oo00 oo00Var) {
        return new String(OooOO0O(oo00Var, OooO0o0(oo00Var)), "UTF-8");
    }

    public static void OooO0oo(BufferedOutputStream bufferedOutputStream, int i) throws IOException {
        bufferedOutputStream.write(i & 255);
        bufferedOutputStream.write((i >> 8) & 255);
        bufferedOutputStream.write((i >> 16) & 255);
        bufferedOutputStream.write((i >> 24) & 255);
    }

    public static void OooOO0(BufferedOutputStream bufferedOutputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        OooO(bufferedOutputStream, length);
        bufferedOutputStream.write(bytes, 0, length);
    }

    public static byte[] OooOO0O(oo00 oo00Var, long j) throws IOException {
        long j2 = oo00Var.f23014OooOo0o - oo00Var.f23012OooOo;
        if (j >= 0 && j <= j2) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(oo00Var).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sbOooOOo = OooO0oO.OooOo.OooOOo(j, "streamToBytes length=", ", maxLength=");
        sbOooOOo.append(j2);
        throw new IOException(sbOooOOo.toString());
    }

    public static int OooOO0o(oo00 oo00Var) throws IOException {
        int i = oo00Var.read();
        if (i != -1) {
            return i;
        }
        throw new EOFException();
    }

    public static final String OooOOO(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    public synchronized oOO0O0O OooO00o(String str) {
        oo000000 oo000000Var = (oo000000) ((LinkedHashMap) this.f16770OooO0OO).get(str);
        if (oo000000Var == null) {
            return null;
        }
        File fileOooO0o = OooO0o(str);
        try {
            oo00 oo00Var = new oo00(new BufferedInputStream(new FileInputStream(fileOooO0o)), fileOooO0o.length());
            try {
                oo000000 oo000000VarOooO00o = oo000000.OooO00o(oo00Var);
                if (!TextUtils.equals(str, oo000000VarOooO00o.f23016OooO0O0)) {
                    oOOo0O00.OooO00o("%s: key=%s, found=%s", fileOooO0o.getAbsolutePath(), str, oo000000VarOooO00o.f23016OooO0O0);
                    oo000000 oo000000Var2 = (oo000000) ((LinkedHashMap) this.f16770OooO0OO).remove(str);
                    if (oo000000Var2 != null) {
                        this.f16768OooO00o -= oo000000Var2.f23015OooO00o;
                    }
                    return null;
                }
                byte[] bArrOooOO0O = OooOO0O(oo00Var, oo00Var.f23014OooOo0o - oo00Var.f23012OooOo);
                oOO0O0O ooo0o0o = new oOO0O0O();
                ooo0o0o.f22800OooO00o = bArrOooOO0O;
                ooo0o0o.f22801OooO0O0 = oo000000Var.f23017OooO0OO;
                ooo0o0o.f22802OooO0OO = oo000000Var.f23018OooO0Oo;
                ooo0o0o.f22803OooO0Oo = oo000000Var.f23020OooO0o0;
                ooo0o0o.f22805OooO0o0 = oo000000Var.f23019OooO0o;
                ooo0o0o.f22804OooO0o = oo000000Var.f23021OooO0oO;
                List<oOO0OoO0> list = oo000000Var.f23022OooO0oo;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (oOO0OoO0 ooo0ooo0 : list) {
                    treeMap.put(ooo0ooo0.f22819OooO00o, ooo0ooo0.f22820OooO0O0);
                }
                ooo0o0o.f22806OooO0oO = treeMap;
                ooo0o0o.f22807OooO0oo = Collections.unmodifiableList(oo000000Var.f23022OooO0oo);
                return ooo0o0o;
            } finally {
                oo00Var.close();
            }
        } catch (IOException e) {
            oOOo0O00.OooO00o("%s: %s", fileOooO0o.getAbsolutePath(), e.toString());
            synchronized (this) {
                boolean zDelete = OooO0o(str).delete();
                oo000000 oo000000Var3 = (oo000000) ((LinkedHashMap) this.f16770OooO0OO).remove(str);
                if (oo000000Var3 != null) {
                    this.f16768OooO00o -= oo000000Var3.f23015OooO00o;
                }
                if (!zDelete) {
                    oOOo0O00.OooO00o("Could not delete cache entry for key=%s, filename=%s", str, OooOOO(str));
                }
                return null;
            }
        }
    }

    public synchronized void OooO0O0() {
        File fileZza = ((O0000000) this.f16771OooO0Oo).zza();
        if (fileZza.exists()) {
            File[] fileArrListFiles = fileZza.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    try {
                        long length = file.length();
                        oo00 oo00Var = new oo00(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            oo000000 oo000000VarOooO00o = oo000000.OooO00o(oo00Var);
                            oo000000VarOooO00o.f23015OooO00o = length;
                            OooOOO0(oo000000VarOooO00o.f23016OooO0O0, oo000000VarOooO00o);
                            oo00Var.close();
                        } catch (Throwable th) {
                            oo00Var.close();
                            throw th;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        } else if (!fileZza.mkdirs()) {
            oOOo0O00.OooO0O0("Unable to create cache dir %s", fileZza.getAbsolutePath());
        }
    }

    public synchronized void OooO0OO(String str, oOO0O0O ooo0o0o) {
        try {
            long j = this.f16768OooO00o;
            int length = ooo0o0o.f22800OooO00o.length;
            long j2 = j + length;
            int i = this.f16769OooO0O0;
            if (j2 <= i || length <= i * 0.9f) {
                File fileOooO0o = OooO0o(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileOooO0o));
                    oo000000 oo000000Var = new oo000000(str, ooo0o0o);
                    try {
                        OooO0oo(bufferedOutputStream, 538247942);
                        OooOO0(bufferedOutputStream, str);
                        String str2 = oo000000Var.f23017OooO0OO;
                        if (str2 == null) {
                            str2 = "";
                        }
                        OooOO0(bufferedOutputStream, str2);
                        OooO(bufferedOutputStream, oo000000Var.f23018OooO0Oo);
                        OooO(bufferedOutputStream, oo000000Var.f23020OooO0o0);
                        OooO(bufferedOutputStream, oo000000Var.f23019OooO0o);
                        OooO(bufferedOutputStream, oo000000Var.f23021OooO0oO);
                        List<oOO0OoO0> list = oo000000Var.f23022OooO0oo;
                        if (list != null) {
                            OooO0oo(bufferedOutputStream, list.size());
                            for (oOO0OoO0 ooo0ooo0 : list) {
                                OooOO0(bufferedOutputStream, ooo0ooo0.f22819OooO00o);
                                OooOO0(bufferedOutputStream, ooo0ooo0.f22820OooO0O0);
                            }
                        } else {
                            OooO0oo(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(ooo0o0o.f22800OooO00o);
                        bufferedOutputStream.close();
                        oo000000Var.f23015OooO00o = fileOooO0o.length();
                        OooOOO0(str, oo000000Var);
                        if (this.f16768OooO00o >= this.f16769OooO0O0) {
                            if (oOOo0O00.f22855OooO00o) {
                                oOOo0O00.OooO0OO("Pruning old cache entries.", new Object[0]);
                            }
                            long j3 = this.f16768OooO00o;
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = ((LinkedHashMap) this.f16770OooO0OO).entrySet().iterator();
                            int i2 = 0;
                            while (it.hasNext()) {
                                oo000000 oo000000Var2 = (oo000000) ((Map.Entry) it.next()).getValue();
                                if (OooO0o(oo000000Var2.f23016OooO0O0).delete()) {
                                    this.f16768OooO00o -= oo000000Var2.f23015OooO00o;
                                } else {
                                    String str3 = oo000000Var2.f23016OooO0O0;
                                    oOOo0O00.OooO00o("Could not delete cache entry for key=%s, filename=%s", str3, OooOOO(str3));
                                }
                                it.remove();
                                i2++;
                                if (this.f16768OooO00o < this.f16769OooO0O0 * 0.9f) {
                                    break;
                                }
                            }
                            if (oOOo0O00.f22855OooO00o) {
                                oOOo0O00.OooO0OO("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.f16768OooO00o - j3), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                            }
                        }
                    } catch (IOException e) {
                        oOOo0O00.OooO00o("%s", e.toString());
                        bufferedOutputStream.close();
                        oOOo0O00.OooO00o("Failed to write header for %s", fileOooO0o.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!fileOooO0o.delete()) {
                        oOOo0O00.OooO00o("Could not clean up file %s", fileOooO0o.getAbsolutePath());
                    }
                    if (!((O0000000) this.f16771OooO0Oo).zza().exists()) {
                        oOOo0O00.OooO00o("Re-initializing cache after external clearing.", new Object[0]);
                        ((LinkedHashMap) this.f16770OooO0OO).clear();
                        this.f16768OooO00o = 0L;
                        OooO0O0();
                    }
                }
            }
        } finally {
        }
    }

    public File OooO0o(String str) {
        return new File(((O0000000) this.f16771OooO0Oo).zza(), OooOOO(str));
    }

    public void OooOOO0(String str, oo000000 oo000000Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f16770OooO0OO;
        if (linkedHashMap.containsKey(str)) {
            this.f16768OooO00o = (oo000000Var.f23015OooO00o - ((oo000000) linkedHashMap.get(str)).f23015OooO00o) + this.f16768OooO00o;
        } else {
            this.f16768OooO00o += oo000000Var.f23015OooO00o;
        }
        linkedHashMap.put(str, oo000000Var);
    }

    public O0O0(C2249xx c2249xx) {
        this.f16770OooO0OO = new LinkedHashMap(16, 0.75f, true);
        this.f16768OooO00o = 0L;
        this.f16771OooO0Oo = c2249xx;
        this.f16769OooO0O0 = 5242880;
    }

    public O0O0(File file) {
        this.f16770OooO0OO = new LinkedHashMap(16, 0.75f, true);
        this.f16768OooO00o = 0L;
        this.f16771OooO0Oo = new p80(file, 4);
        this.f16769OooO0O0 = 20971520;
    }
}
