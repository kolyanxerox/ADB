package o00O00;

import android.os.Bundle;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.Map;
import o000Oo0O.OooOo00;

/* loaded from: classes3.dex */
public final class OooO0O0 implements MethodChannel.MethodCallHandler {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final OooOo00 f31254OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public MethodChannel f31255OooOo0o;

    public OooO0O0(OooOo00 oooOo00) {
        this.f31254OooOo0O = oooOo00;
    }

    public static Bundle OooO00o(Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (obj instanceof Integer) {
                    bundle.putInt(str, ((Integer) obj).intValue());
                } else if (obj instanceof String) {
                    bundle.putString(str, (String) obj);
                } else if (obj instanceof Boolean) {
                    bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Double) {
                    bundle.putDouble(str, ((Double) obj).doubleValue());
                } else if (obj instanceof Long) {
                    bundle.putLong(str, ((Long) obj).longValue());
                } else if (obj instanceof byte[]) {
                    bundle.putByteArray(str, (byte[]) obj);
                } else if (obj instanceof int[]) {
                    bundle.putIntArray(str, (int[]) obj);
                } else if (obj instanceof long[]) {
                    bundle.putLongArray(str, (long[]) obj);
                } else if (obj instanceof double[]) {
                    bundle.putDoubleArray(str, (double[]) obj);
                } else if (OooO0OO(Integer.class, obj)) {
                    bundle.putIntegerArrayList(str, (ArrayList) obj);
                } else {
                    if (!OooO0OO(String.class, obj)) {
                        if (obj instanceof Map) {
                            for (Object obj2 : ((Map) obj).keySet()) {
                                if (obj2 == null || (obj2 instanceof String)) {
                                }
                            }
                            bundle.putBundle(str, OooO00o((Map) obj));
                        }
                        throw new UnsupportedOperationException("Unsupported type " + obj);
                    }
                    bundle.putStringArrayList(str, (ArrayList) obj);
                }
            }
        }
        return bundle;
    }

    public static Bundle OooO0O0(Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                int i = 0;
                if (OooO0OO(Boolean.class, obj)) {
                    ArrayList arrayList = (ArrayList) obj;
                    boolean[] zArr = new boolean[arrayList.size()];
                    while (i < arrayList.size()) {
                        zArr[i] = ((Boolean) arrayList.get(i)).booleanValue();
                        i++;
                    }
                    bundle.putBooleanArray(str, zArr);
                } else if (OooO0OO(Integer.class, obj)) {
                    ArrayList arrayList2 = (ArrayList) obj;
                    int[] iArr = new int[arrayList2.size()];
                    while (i < arrayList2.size()) {
                        iArr[i] = ((Integer) arrayList2.get(i)).intValue();
                        i++;
                    }
                    bundle.putIntArray(str, iArr);
                } else if (OooO0OO(Long.class, obj)) {
                    ArrayList arrayList3 = (ArrayList) obj;
                    long[] jArr = new long[arrayList3.size()];
                    while (i < arrayList3.size()) {
                        jArr[i] = ((Long) arrayList3.get(i)).longValue();
                        i++;
                    }
                    bundle.putLongArray(str, jArr);
                } else if (OooO0OO(Double.class, obj)) {
                    ArrayList arrayList4 = (ArrayList) obj;
                    double[] dArr = new double[arrayList4.size()];
                    while (i < arrayList4.size()) {
                        dArr[i] = ((Double) arrayList4.get(i)).doubleValue();
                        i++;
                    }
                    bundle.putDoubleArray(str, dArr);
                } else {
                    if (!OooO0OO(String.class, obj)) {
                        throw new UnsupportedOperationException("Unsupported type " + obj);
                    }
                    ArrayList arrayList5 = (ArrayList) obj;
                    bundle.putStringArray(str, (String[]) arrayList5.toArray(new String[arrayList5.size()]));
                }
            }
        }
        return bundle;
    }

    public static boolean OooO0OO(Class cls, Object obj) {
        if (obj instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) obj;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                if (obj2 == null || cls.isInstance(obj2)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0143 A[Catch: all -> 0x0109, TryCatch #1 {all -> 0x0109, blocks: (B:50:0x00e7, B:52:0x00f5, B:58:0x011a, B:62:0x012c, B:64:0x0132, B:69:0x0143, B:66:0x0137, B:70:0x014d, B:71:0x0155, B:73:0x015f, B:74:0x0173, B:76:0x017d, B:78:0x0183, B:80:0x01a1, B:79:0x0189, B:81:0x01a5, B:83:0x01af, B:84:0x01b6, B:86:0x01c0, B:88:0x01c6, B:92:0x01d5, B:90:0x01cb, B:93:0x01dd, B:95:0x01e7, B:96:0x01ef, B:57:0x010d), top: B:102:0x00e7, inners: #0 }] */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMethodCall(io.flutter.plugin.common.MethodCall r18, io.flutter.plugin.common.MethodChannel.Result r19) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o00O00.OooO0O0.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }
}
