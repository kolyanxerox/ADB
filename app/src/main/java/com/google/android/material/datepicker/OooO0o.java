package com.google.android.material.datepicker;

import OoooO0O.o0000O00;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import androidx.core.util.Preconditions;
import com.google.android.gms.internal.ads.li0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o00O0.o00oO0o;
import o00O0.o0O0O00;

/* loaded from: classes2.dex */
public final class OooO0o {

    /* renamed from: OooO00o */
    public int f27529OooO00o;

    /* renamed from: OooO0O0 */
    public final Object f27530OooO0O0;

    /* renamed from: OooO0OO */
    public final Object f27531OooO0OO;

    /* renamed from: OooO0Oo */
    public final Object f27532OooO0Oo;

    /* renamed from: OooO0o */
    public final Object f27533OooO0o;

    /* renamed from: OooO0o0 */
    public final Object f27534OooO0o0;

    public OooO0o(oo0O.OooO0O0 json, o00OO.Oooo0 oooo0, o00OO.OooOo oooOo, o00OO0o.OooO descriptor) {
        kotlin.jvm.internal.OooOo.OooO0o0(json, "json");
        kotlin.jvm.internal.OooOo.OooO0o0(descriptor, "descriptor");
        this.f27530OooO0O0 = json;
        this.f27531OooO0OO = oooo0;
        this.f27532OooO0Oo = oooOo;
        this.f27529OooO00o = -1;
        li0 li0Var = json.f33202OooO00o;
        this.f27534OooO0o0 = li0Var;
        this.f27533OooO0o = li0Var.f20894OooOo0o ? null : new o00OO.OooOO0(descriptor);
    }

    public static OooO0o OooO0O0(Context context, int i) throws Resources.NotFoundException {
        Preconditions.checkArgument(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, Ooooo00.OooOo.f14976OooOoo0);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListOooO00o = oo0o0Oo.OooO0OO.OooO00o(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListOooO00o2 = oo0o0Oo.OooO0OO.OooO00o(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListOooO00o3 = oo0o0Oo.OooO0OO.OooO00o(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        o000000.Oooo000 oooo000OooO00o = o000000.Oooo000.OooO00o(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new o000000.OooO00o(0)).OooO00o();
        typedArrayObtainStyledAttributes.recycle();
        return new OooO0o(colorStateListOooO00o, colorStateListOooO00o2, colorStateListOooO00o3, dimensionPixelSize, oooo000OooO00o, rect);
    }

    public Object OooO(o00OO0o.OooO descriptor, int i, o00OO0OO.OooO00o deserializer, Object obj) {
        kotlin.jvm.internal.OooOo.OooO0o0(descriptor, "descriptor");
        kotlin.jvm.internal.OooOo.OooO0o0(deserializer, "deserializer");
        if (deserializer.OooO0Oo().OooO0O0() || OooO0oo()) {
            return OooOO0O(deserializer);
        }
        return null;
    }

    public OooO0o OooO00o(o00OO0o.OooO descriptor) {
        byte bOooO0O0;
        kotlin.jvm.internal.OooOo.OooO0o0(descriptor, "descriptor");
        oo0O.OooO0O0 oooO0O0 = (oo0O.OooO0O0) this.f27530OooO0O0;
        o00OO.Oooo0 oooo0OooO0oO = o00OO.OooOOO.OooO0oO(descriptor, oooO0O0);
        o00OO.OooOo oooOo = (o00OO.OooOo) this.f27532OooO0Oo;
        o0000O00 o0000o00 = oooOo.f31868OooO0O0;
        int i = o0000o00.f13928OooO0O0 + 1;
        o0000o00.f13928OooO0O0 = i;
        Object[] objArr = (Object[]) o0000o00.f13929OooO0OO;
        if (i == objArr.length) {
            int i2 = i * 2;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i2);
            kotlin.jvm.internal.OooOo.OooO0Oo(objArrCopyOf, "copyOf(...)");
            o0000o00.f13929OooO0OO = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf((int[]) o0000o00.f13930OooO0Oo, i2);
            kotlin.jvm.internal.OooOo.OooO0Oo(iArrCopyOf, "copyOf(...)");
            o0000o00.f13930OooO0Oo = iArrCopyOf;
        }
        ((Object[]) o0000o00.f13929OooO0OO)[i] = descriptor;
        oooOo.OooO0o0(oooo0OooO0oO.f31886OooOo0O);
        int i3 = oooOo.f31867OooO00o;
        while (true) {
            int iOooOOO = oooOo.OooOOO(i3);
            bOooO0O0 = 10;
            if (iOooOOO == -1) {
                oooOo.f31867OooO00o = iOooOOO;
                break;
            }
            char cCharAt = oooOo.f31871OooO0o0.charAt(iOooOOO);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                oooOo.f31867OooO00o = iOooOOO;
                bOooO0O0 = o00OO.OooOOO.OooO0O0(cCharAt);
                break;
            }
            i3 = iOooOOO + 1;
        }
        if (bOooO0O0 != 4) {
            int iOrdinal = oooo0OooO0oO.ordinal();
            return (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) ? new OooO0o(oooO0O0, oooo0OooO0oO, oooOo, descriptor) : (((o00OO.Oooo0) this.f27531OooO0OO) == oooo0OooO0oO && oooO0O0.f33202OooO00o.f20894OooOo0o) ? this : new OooO0o(oooO0O0, oooo0OooO0oO, oooOo, descriptor);
        }
        o00OO.OooOo.OooOO0O(oooOo, "Unexpected leading comma", 0, 6);
        throw null;
    }

    public int OooO0OO(final o00OO0o.OooO descriptor) throws Throwable {
        Throwable th;
        Object objInvoke;
        Object obj;
        kotlin.jvm.internal.OooOo.OooO0o0(descriptor, "descriptor");
        o00OO.Oooo0 oooo0 = (o00OO.Oooo0) this.f27531OooO0OO;
        int iOrdinal = oooo0.ordinal();
        o00OO.OooOo oooOo = (o00OO.OooOo) this.f27532OooO0Oo;
        int i = 0;
        zOooOOOo = false;
        boolean zOooOOOo = false;
        final oo0O.OooO0O0 json = (oo0O.OooO0O0) this.f27530OooO0O0;
        int iIntValue = -1;
        if (iOrdinal == 0) {
            boolean zOooOOOo2 = oooOo.OooOOOo();
            boolean zOooO0O0 = oooOo.OooO0O0();
            o00OO.OooOO0 oooOO0 = (o00OO.OooOO0) this.f27533OooO0o;
            if (zOooO0O0) {
                ((li0) this.f27534OooO0o0).getClass();
                String name = oooOo.OooO0Oo();
                oooOo.OooO0o0(':');
                kotlin.jvm.internal.OooOo.OooO0o0(descriptor, "<this>");
                kotlin.jvm.internal.OooOo.OooO0o0(json, "json");
                kotlin.jvm.internal.OooOo.OooO0o0(name, "name");
                li0 li0Var = json.f33202OooO00o;
                li0Var.getClass();
                o00OO.OooOOO.OooO0o(descriptor, json);
                int iOooO0OO = descriptor.OooO0OO(name);
                iIntValue = -3;
                if (iOooO0OO == -3 && li0Var.f20892OooOo) {
                    o00OO.OooOOOO oooOOOO = o00OO.OooOOO.f31863OooO00o;
                    o00O0Oo.OooO0O0 oooO0O0 = new o00O0Oo.OooO0O0() { // from class: o00OO.OooOOO0
                        @Override // o00O0Oo.OooO0O0
                        public final Object invoke() {
                            String[] strArrNames;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            oo0O.OooO0O0 oooO0O02 = json;
                            oooO0O02.f33202OooO00o.getClass();
                            o00OO0o.OooO oooO = descriptor;
                            OooOOO.OooO0o(oooO, oooO0O02);
                            int iOooO0Oo = oooO.OooO0Oo();
                            for (int i2 = 0; i2 < iOooO0Oo; i2++) {
                                List listOooO0o = oooO.OooO0o(i2);
                                ArrayList arrayList = new ArrayList();
                                for (Object obj2 : listOooO0o) {
                                    if (obj2 instanceof oo0O.OooO0o) {
                                        arrayList.add(obj2);
                                    }
                                }
                                oo0O.OooO0o oooO0o = (oo0O.OooO0o) (arrayList.size() == 1 ? arrayList.get(0) : null);
                                if (oooO0o != null && (strArrNames = oooO0o.names()) != null) {
                                    for (String str : strArrNames) {
                                        String str2 = kotlin.jvm.internal.OooOo.OooO00o(oooO.getKind(), o00OO0o.OooOO0.f32046OooOoO) ? "enum value" : "property";
                                        if (linkedHashMap.containsKey(str)) {
                                            String message = "The suggested name '" + str + "' for " + str2 + ' ' + oooO.OooO0o0(i2) + " is already one of the names for " + str2 + ' ' + oooO.OooO0o0(((Number) o0O0O00.OooOOO(str, linkedHashMap)).intValue()) + " in " + oooO;
                                            kotlin.jvm.internal.OooOo.OooO0o0(message, "message");
                                            throw new OooOO0O(message);
                                        }
                                        linkedHashMap.put(str, Integer.valueOf(i2));
                                    }
                                }
                            }
                            return linkedHashMap.isEmpty() ? o00oO0o.f31247OooOo0O : linkedHashMap;
                        }
                    };
                    o000Ooo.o00oO0o o00oo0o = json.f33204OooO0OO;
                    o00oo0o.getClass();
                    o00oo0o.getClass();
                    kotlin.jvm.internal.OooOo.OooO0o0(descriptor, "descriptor");
                    Map map = (Map) ((ConcurrentHashMap) o00oo0o.f30487OooOo0o).get(descriptor);
                    Object obj2 = map != null ? map.get(oooOOOO) : null;
                    Object obj3 = obj2 != null ? obj2 : null;
                    if (obj3 != null) {
                        objInvoke = obj3;
                        th = null;
                    } else {
                        objInvoke = oooO0O0.invoke();
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) o00oo0o.f30487OooOo0o;
                        Object obj4 = concurrentHashMap.get(descriptor);
                        if (obj4 == null) {
                            th = null;
                            ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(2);
                            concurrentHashMap.put(descriptor, concurrentHashMap2);
                            obj = concurrentHashMap2;
                        } else {
                            th = null;
                            obj = obj4;
                        }
                        ((Map) obj).put(oooOOOO, objInvoke);
                    }
                    Integer num = (Integer) ((Map) objInvoke).get(name);
                    if (num != null) {
                        iIntValue = num.intValue();
                    }
                } else {
                    th = null;
                    iIntValue = iOooO0OO;
                }
                if (iIntValue == -3) {
                    oooOo.OooOO0(o00O0oO.o000000.OoooOOO(name, oooOo.f31871OooO0o0.subSequence(0, oooOo.f31867OooO00o).toString(), 6), androidx.datastore.preferences.protobuf.OooO00o.OooO0o('\'', "Encountered an unknown key '", name), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                    throw th;
                }
                if (oooOO0 != null) {
                    o00OO0oo.OooOO0O oooOO0O = oooOO0.f31861OooO00o;
                    if (iIntValue < 64) {
                        oooOO0O.f32059OooO0OO |= 1 << iIntValue;
                    } else {
                        int i2 = (iIntValue >>> 6) - 1;
                        long[] jArr = oooOO0O.f32060OooO0Oo;
                        jArr[i2] = jArr[i2] | (1 << (iIntValue & 63));
                    }
                }
            } else {
                if (zOooOOOo2) {
                    json.f33202OooO00o.getClass();
                    o00OO.OooOOO.OooO0Oo(oooOo, "object");
                    throw null;
                }
                if (oooOO0 != null) {
                    o00OO0oo.OooOO0O oooOO0O2 = oooOO0.f31861OooO00o;
                    o00OO0o.OooO oooO = oooOO0O2.f32057OooO00o;
                    int iOooO0Oo = oooO.OooO0Oo();
                    while (true) {
                        long j = oooOO0O2.f32059OooO0OO;
                        long j2 = -1;
                        o00OO.OooO oooO2 = oooOO0O2.f32058OooO0O0;
                        if (j != -1) {
                            int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                            oooOO0O2.f32059OooO0OO |= 1 << iNumberOfTrailingZeros;
                            if (((Boolean) oooO2.invoke(oooO, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue()) {
                                iIntValue = iNumberOfTrailingZeros;
                                break;
                            }
                        } else if (iOooO0Oo > 64) {
                            long[] jArr2 = oooOO0O2.f32060OooO0Oo;
                            int length = jArr2.length;
                            loop1: while (i < length) {
                                int i3 = i + 1;
                                int i4 = i3 * 64;
                                long j3 = j2;
                                long j4 = jArr2[i];
                                while (j4 != j3) {
                                    o00OO.OooO oooO3 = oooO2;
                                    int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j4);
                                    j4 |= 1 << iNumberOfTrailingZeros2;
                                    iIntValue = iNumberOfTrailingZeros2 + i4;
                                    if (((Boolean) oooO3.invoke(oooO, Integer.valueOf(iIntValue))).booleanValue()) {
                                        jArr2[i] = j4;
                                        break loop1;
                                    }
                                    oooO2 = oooO3;
                                }
                                jArr2[i] = j4;
                                i = i3;
                                j2 = j3;
                            }
                        }
                    }
                } else {
                    iIntValue = -1;
                }
            }
        } else if (iOrdinal != 2) {
            boolean zOooOOOo3 = oooOo.OooOOOo();
            if (oooOo.OooO0O0()) {
                int i5 = this.f27529OooO00o;
                if (i5 != -1 && !zOooOOOo3) {
                    o00OO.OooOo.OooOO0O(oooOo, "Expected end of the array or comma", 0, 6);
                    throw null;
                }
                iIntValue = i5 + 1;
                this.f27529OooO00o = iIntValue;
            } else if (zOooOOOo3) {
                json.f33202OooO00o.getClass();
                o00OO.OooOOO.OooO0Oo(oooOo, "array");
                throw null;
            }
        } else {
            int i6 = this.f27529OooO00o;
            boolean z = i6 % 2 != 0;
            if (!z) {
                oooOo.OooO0o0(':');
            } else if (i6 != -1) {
                zOooOOOo = oooOo.OooOOOo();
            }
            if (oooOo.OooO0O0()) {
                if (z) {
                    if (this.f27529OooO00o == -1) {
                        int i7 = oooOo.f31867OooO00o;
                        if (zOooOOOo) {
                            o00OO.OooOo.OooOO0O(oooOo, "Unexpected leading comma", i7, 4);
                            throw null;
                        }
                    } else {
                        int i8 = oooOo.f31867OooO00o;
                        if (!zOooOOOo) {
                            o00OO.OooOo.OooOO0O(oooOo, "Expected comma after the key-value pair", i8, 4);
                            throw null;
                        }
                    }
                }
                iIntValue = this.f27529OooO00o + 1;
                this.f27529OooO00o = iIntValue;
            } else if (zOooOOOo) {
                json.f33202OooO00o.getClass();
                o00OO.OooOOO.OooO0Oo(oooOo, "object");
                throw null;
            }
        }
        if (oooo0 != o00OO.Oooo0.f31881OooOoO) {
            o0000O00 o0000o00 = oooOo.f31868OooO0O0;
            ((int[]) o0000o00.f13930OooO0Oo)[o0000o00.f13928OooO0O0] = iIntValue;
        }
        return iIntValue;
    }

    public int OooO0Oo() {
        o00OO.OooOo oooOo = (o00OO.OooOo) this.f27532OooO0Oo;
        long jOooO0o = oooOo.OooO0o();
        int i = (int) jOooO0o;
        if (jOooO0o == i) {
            return i;
        }
        o00OO.OooOo.OooOO0O(oooOo, "Failed to parse int for input '" + jOooO0o + '\'', 0, 6);
        throw null;
    }

    public long OooO0o() {
        return ((o00OO.OooOo) this.f27532OooO0Oo).OooO0o();
    }

    public int OooO0o0(o00OO0o.OooO descriptor, int i) {
        kotlin.jvm.internal.OooOo.OooO0o0(descriptor, "descriptor");
        return OooO0Oo();
    }

    public long OooO0oO(o00OO0o.OooO descriptor, int i) {
        kotlin.jvm.internal.OooOo.OooO0o0(descriptor, "descriptor");
        return OooO0o();
    }

    public boolean OooO0oo() {
        o00OO.OooOO0 oooOO0 = (o00OO.OooOO0) this.f27533OooO0o;
        if (!(oooOO0 != null ? oooOO0.f31862OooO0O0 : false)) {
            o00OO.OooOo oooOo = (o00OO.OooOo) this.f27532OooO0Oo;
            int iOooOOO = oooOo.OooOOO(oooOo.OooOOOO());
            String str = oooOo.f31871OooO0o0;
            int length = str.length() - iOooOOO;
            boolean z = false;
            if (length >= 4 && iOooOOO != -1) {
                int i = 0;
                while (true) {
                    if (i < 4) {
                        if ("null".charAt(i) != str.charAt(iOooOOO + i)) {
                            break;
                        }
                        i++;
                    } else if (length <= 4 || o00OO.OooOOO.OooO0O0(str.charAt(iOooOOO + 4)) != 0) {
                        oooOo.f31867OooO00o = iOooOOO + 4;
                        z = true;
                    }
                }
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    public Object OooOO0(o00OO0o.OooO descriptor, int i, o00OO0OO.OooO00o deserializer, Object obj) {
        kotlin.jvm.internal.OooOo.OooO0o0(descriptor, "descriptor");
        kotlin.jvm.internal.OooOo.OooO0o0(deserializer, "deserializer");
        boolean z = ((o00OO.Oooo0) this.f27531OooO0OO) == o00OO.Oooo0.f31881OooOoO && (i & 1) == 0;
        o0000O00 o0000o00 = ((o00OO.OooOo) this.f27532OooO0Oo).f31868OooO0O0;
        if (z) {
            int[] iArr = (int[]) o0000o00.f13930OooO0Oo;
            int i2 = o0000o00.f13928OooO0O0;
            if (iArr[i2] == -2) {
                ((Object[]) o0000o00.f13929OooO0OO)[i2] = o00OO.OooOOOO.f31866OooO00o;
            }
        }
        kotlin.jvm.internal.OooOo.OooO0o0(descriptor, "descriptor");
        kotlin.jvm.internal.OooOo.OooO0o0(deserializer, "deserializer");
        Object objOooOO0O = OooOO0O(deserializer);
        if (z) {
            int[] iArr2 = (int[]) o0000o00.f13930OooO0Oo;
            int i3 = o0000o00.f13928OooO0O0;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                o0000o00.f13928OooO0O0 = i4;
                Object[] objArr = (Object[]) o0000o00.f13929OooO0OO;
                if (i4 == objArr.length) {
                    int i5 = i4 * 2;
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, i5);
                    kotlin.jvm.internal.OooOo.OooO0Oo(objArrCopyOf, "copyOf(...)");
                    o0000o00.f13929OooO0OO = objArrCopyOf;
                    int[] iArrCopyOf = Arrays.copyOf((int[]) o0000o00.f13930OooO0Oo, i5);
                    kotlin.jvm.internal.OooOo.OooO0Oo(iArrCopyOf, "copyOf(...)");
                    o0000o00.f13930OooO0Oo = iArrCopyOf;
                }
            }
            Object[] objArr2 = (Object[]) o0000o00.f13929OooO0OO;
            int i6 = o0000o00.f13928OooO0O0;
            objArr2[i6] = objOooOO0O;
            ((int[]) o0000o00.f13930OooO0Oo)[i6] = -2;
        }
        return objOooOO0O;
    }

    public Object OooOO0O(o00OO0OO.OooO00o deserializer) {
        kotlin.jvm.internal.OooOo.OooO0o0(deserializer, "deserializer");
        try {
            return deserializer.OooO0OO(this);
        } catch (o00OO0OO.OooO0O0 e) {
            String message = e.getMessage();
            kotlin.jvm.internal.OooOo.OooO0O0(message);
            if (o00O0oO.o000000.Oooo0o("at path", message)) {
                throw e;
            }
            throw new o00OO0OO.OooO0O0(e.f32040OooOo0O, e.getMessage() + " at path: " + ((o00OO.OooOo) this.f27532OooO0Oo).f31868OooO0O0.OooO0o0(), e);
        }
    }

    public String OooOO0o() {
        ((li0) this.f27534OooO0o0).getClass();
        return ((o00OO.OooOo) this.f27532OooO0Oo).OooO0oO();
    }

    public void OooOOO(o00OO0o.OooO descriptor) {
        kotlin.jvm.internal.OooOo.OooO0o0(descriptor, "descriptor");
        oo0O.OooO0O0 oooO0O0 = (oo0O.OooO0O0) this.f27530OooO0O0;
        oooO0O0.f33202OooO00o.getClass();
        o00OO.OooOo oooOo = (o00OO.OooOo) this.f27532OooO0Oo;
        if (oooOo.OooOOOo()) {
            oooO0O0.f33202OooO00o.getClass();
            o00OO.OooOOO.OooO0Oo(oooOo, "");
            throw null;
        }
        oooOo.OooO0o0(((o00OO.Oooo0) this.f27531OooO0OO).f31887OooOo0o);
        o0000O00 o0000o00 = oooOo.f31868OooO0O0;
        int i = o0000o00.f13928OooO0O0;
        int[] iArr = (int[]) o0000o00.f13930OooO0Oo;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            o0000o00.f13928OooO0O0 = i - 1;
        }
        int i2 = o0000o00.f13928OooO0O0;
        if (i2 != -1) {
            o0000o00.f13928OooO0O0 = i2 - 1;
        }
    }

    public String OooOOO0(o00OO0o.OooO descriptor, int i) {
        kotlin.jvm.internal.OooOo.OooO0o0(descriptor, "descriptor");
        return OooOO0o();
    }

    public OooO0o(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, o000000.Oooo000 oooo000, Rect rect) {
        Preconditions.checkArgumentNonnegative(rect.left);
        Preconditions.checkArgumentNonnegative(rect.top);
        Preconditions.checkArgumentNonnegative(rect.right);
        Preconditions.checkArgumentNonnegative(rect.bottom);
        this.f27530OooO0O0 = rect;
        this.f27531OooO0OO = colorStateList2;
        this.f27532OooO0Oo = colorStateList;
        this.f27534OooO0o0 = colorStateList3;
        this.f27529OooO00o = i;
        this.f27533OooO0o = oooo000;
    }
}
