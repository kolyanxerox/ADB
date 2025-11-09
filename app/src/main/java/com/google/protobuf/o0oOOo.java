package com.google.protobuf;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.text.HtmlCompat;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.WireFormat;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.pipes.PipesConfigBase;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class o0oOOo implements o0oO0O0o {

    /* renamed from: OooO, reason: collision with root package name */
    public final int[] f28408OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int[] f28409OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Object[] f28410OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f28411OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f28412OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final boolean f28413OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final MessageLite f28414OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f28415OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f28416OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final int f28417OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public final int f28418OooOO0O;
    public final o0O0000O OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public final o0OO00o0 f28419OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public final o00OO0O0 f28420OooOOO0;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public final o000O00 f28421OooOOOO;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public final o00OOOO0 f28422OooOOOo;

    /* renamed from: OooOOo0, reason: collision with root package name */
    public static final int[] f28407OooOOo0 = new int[0];

    /* renamed from: OooOOo, reason: collision with root package name */
    public static final Unsafe f28406OooOOo = o0OO.OooOO0o();

    public o0oOOo(int[] iArr, Object[] objArr, int i, int i2, MessageLite messageLite, boolean z, int[] iArr2, int i3, int i4, o0O0000O o0o0000o, o00OO0O0 o00oo0o0, o0OO00o0 o0oo00o0, o000O00 o000o002, o00OOOO0 o00oooo0) {
        this.f28409OooO00o = iArr;
        this.f28410OooO0O0 = objArr;
        this.f28411OooO0OO = i;
        this.f28412OooO0Oo = i2;
        this.f28415OooO0oO = messageLite instanceof GeneratedMessageLite;
        this.f28413OooO0o = o000o002 != null && (messageLite instanceof GeneratedMessageLite.ExtendableMessage);
        this.f28416OooO0oo = z;
        this.f28408OooO = iArr2;
        this.f28417OooOO0 = i3;
        this.f28418OooOO0O = i4;
        this.OooOO0o = o0o0000o;
        this.f28420OooOOO0 = o00oo0o0;
        this.f28419OooOOO = o0oo00o0;
        this.f28421OooOOOO = o000o002;
        this.f28414OooO0o0 = messageLite;
        this.f28422OooOOOo = o00oooo0;
    }

    public static int OooO(byte[] bArr, int i, int i2, WireFormat.FieldType fieldType, Class cls, OooOO0O oooOO0O) throws InvalidProtocolBufferException {
        switch (oo00oO.f28434OooO00o[fieldType.ordinal()]) {
            case 1:
                int iOooOo00 = OooOOO0.OooOo00(bArr, i, oooOO0O);
                oooOO0O.f28165OooO0OO = Boolean.valueOf(oooOO0O.f28164OooO0O0 != 0);
                return iOooOo00;
            case 2:
                return OooOOO0.OooO00o(bArr, i, oooOO0O);
            case 3:
                oooOO0O.f28165OooO0OO = Double.valueOf(Double.longBitsToDouble(OooOOO0.OooO0OO(bArr, i)));
                return i + 8;
            case 4:
            case 5:
                oooOO0O.f28165OooO0OO = Integer.valueOf(OooOOO0.OooO0O0(bArr, i));
                return i + 4;
            case 6:
            case 7:
                oooOO0O.f28165OooO0OO = Long.valueOf(OooOOO0.OooO0OO(bArr, i));
                return i + 8;
            case 8:
                oooOO0O.f28165OooO0OO = Float.valueOf(Float.intBitsToFloat(OooOOO0.OooO0O0(bArr, i)));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int iOooOOo = OooOOO0.OooOOo(bArr, i, oooOO0O);
                oooOO0O.f28165OooO0OO = Integer.valueOf(oooOO0O.f28163OooO00o);
                return iOooOOo;
            case 12:
            case 13:
                int iOooOo002 = OooOOO0.OooOo00(bArr, i, oooOO0O);
                oooOO0O.f28165OooO0OO = Long.valueOf(oooOO0O.f28164OooO0O0);
                return iOooOo002;
            case 14:
                return OooOOO0.OooO0o0(o0O00O.f28290OooO0OO.OooO00o(cls), bArr, i, i2, oooOO0O);
            case 15:
                int iOooOOo2 = OooOOO0.OooOOo(bArr, i, oooOO0O);
                oooOO0O.f28165OooO0OO = Integer.valueOf(CodedInputStream.decodeZigZag32(oooOO0O.f28163OooO00o));
                return iOooOOo2;
            case 16:
                int iOooOo003 = OooOOO0.OooOo00(bArr, i, oooOO0O);
                oooOO0O.f28165OooO0OO = Long.valueOf(CodedInputStream.decodeZigZag64(oooOO0O.f28164OooO0O0));
                return iOooOo003;
            case 17:
                int iOooOOo3 = OooOOO0.OooOOo(bArr, i, oooOO0O);
                int i3 = oooOO0O.f28163OooO00o;
                if (i3 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                if (i3 == 0) {
                    oooOO0O.f28165OooO0OO = "";
                    return iOooOOo3;
                }
                oooOO0O.f28165OooO0OO = o0OOO0OO.f28370OooO00o.OooO0Oo(bArr, iOooOOo3, i3);
                return iOooOOo3 + i3;
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    public static void OooO0oo(Object obj) {
        if (OooOOo0(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public static UnknownFieldSetLite OooOOO(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.getDefaultInstance()) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
        generatedMessageLite.unknownFields = unknownFieldSetLiteNewInstance;
        return unknownFieldSetLiteNewInstance;
    }

    public static boolean OooOOo0(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.protobuf.o0oOOo OooOoO(com.google.protobuf.o0O00OOO r35, com.google.protobuf.o0O0000O r36, com.google.protobuf.o00OO0O0 r37, com.google.protobuf.o0OO00o0 r38, com.google.protobuf.o000O00 r39, com.google.protobuf.o00OOOO0 r40) {
        /*
            Method dump skipped, instructions count: 1075
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.o0oOOo.OooOoO(com.google.protobuf.o0O00OOO, com.google.protobuf.o0O0000O, com.google.protobuf.o00OO0O0, com.google.protobuf.o0OO00o0, com.google.protobuf.o000O00, com.google.protobuf.o00OOOO0):com.google.protobuf.o0oOOo");
    }

    public static o0oOOo OooOoO0(o00Oo00 o00oo00, o0O0000O o0o0000o, o00OO0O0 o00oo0o0, o0OO00o0 o0oo00o0, o000O00 o000o002, o00OOOO0 o00oooo0) {
        int i;
        int i2;
        int i3;
        int[] iArr;
        int[] iArr2;
        int iOooOOO;
        int iNumberOfTrailingZeros;
        boolean z;
        char c;
        if (o00oo00 instanceof o0O00OOO) {
            return OooOoO((o0O00OOO) o00oo00, o0o0000o, o00oo0o0, o0oo00o0, o000o002, o00oooo0);
        }
        o0O0oo00 o0o0oo00 = (o0O0oo00) o00oo00;
        o00O0000[] o00o0000Arr = o0o0oo00.f28339OooO0Oo;
        if (o00o0000Arr.length == 0) {
            i = 0;
            i2 = 0;
        } else {
            i = o00o0000Arr[0].f28240OooOo;
            i2 = o00o0000Arr[o00o0000Arr.length - 1].f28240OooOo;
        }
        int length = o00o0000Arr.length;
        int[] iArr3 = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i4 = 0;
        int i5 = 0;
        for (o00O0000 o00o0000 : o00o0000Arr) {
            FieldType fieldType = o00o0000.f28242OooOo0o;
            if (fieldType == FieldType.MAP) {
                i4++;
            } else if (fieldType.m3972id() >= 18 && o00o0000.f28242OooOo0o.m3972id() <= 49) {
                i5++;
            }
        }
        int[] iArr4 = i4 > 0 ? new int[i4] : null;
        int[] iArr5 = i5 > 0 ? new int[i5] : null;
        int[] iArr6 = f28407OooOOo0;
        int[] iArr7 = o0o0oo00.f28338OooO0OO;
        if (iArr7 == null) {
            iArr7 = iArr6;
        }
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i7 < o00o0000Arr.length) {
            o00O0000 o00o00002 = o00o0000Arr[i7];
            int i11 = o00o00002.f28240OooOo;
            o0OO0oO0 o0oo0oo0 = o0OO.f28347OooO0OO;
            o00O0000[] o00o0000Arr2 = o00o0000Arr;
            java.lang.reflect.Field field = o00o00002.f28241OooOo0O;
            int i12 = i2;
            Object[] objArr2 = objArr;
            int iOooOOO2 = (int) o0oo0oo0.OooOOO(field);
            FieldType fieldType2 = o00o00002.f28242OooOo0o;
            int iM3972id = fieldType2.m3972id();
            if (fieldType2.isList() || fieldType2.isMap()) {
                i3 = i;
                iArr = iArr3;
                iArr2 = iArr4;
                java.lang.reflect.Field field2 = o00o00002.f28246OooOoo;
                iOooOOO = field2 == null ? 0 : (int) o0oo0oo0.OooOOO(field2);
                iNumberOfTrailingZeros = 0;
            } else {
                i3 = i;
                java.lang.reflect.Field field3 = o00o00002.f28244OooOoO0;
                if (field3 == null) {
                    iOooOOO = 1048575;
                    iArr = iArr3;
                    iArr2 = iArr4;
                } else {
                    iArr = iArr3;
                    iArr2 = iArr4;
                    iOooOOO = (int) o0oo0oo0.OooOOO(field3);
                }
                iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(o00o00002.f28243OooOoO);
            }
            iArr[i8] = o00o00002.f28240OooOo;
            int i13 = iOooOOO;
            iArr[i8 + 1] = (o00o00002.f28247OooOoo0 ? 536870912 : 0) | (o00o00002.f28245OooOoOO ? 268435456 : 0) | (iM3972id << 20) | iOooOOO2;
            iArr[i8 + 2] = (iNumberOfTrailingZeros << 20) | i13;
            int i14 = o00.f28179OooO00o[fieldType2.ordinal()];
            Class<?> type = ((i14 == 1 || i14 == 2) && field != null) ? field.getType() : null;
            Internal.EnumVerifier enumVerifier = o00o00002.f28249OooOooo;
            Object obj = o00o00002.f28248OooOooO;
            if (obj != null) {
                int i15 = (i8 / 3) * 2;
                objArr2[i15] = obj;
                if (type != null) {
                    objArr2[i15 + 1] = type;
                } else if (enumVerifier != null) {
                    objArr2[i15 + 1] = enumVerifier;
                }
                z = true;
            } else if (type != null) {
                z = true;
                objArr2[OooO0oO.OooOo.OooOoOO(i8, 3, 2, 1)] = type;
            } else {
                z = true;
                if (enumVerifier != null) {
                    objArr2[OooO0oO.OooOo.OooOoOO(i8, 3, 2, 1)] = enumVerifier;
                }
            }
            if (i6 < iArr7.length && iArr7[i6] == i11) {
                iArr7[i6] = i8;
                i6++;
            }
            if (fieldType2 == FieldType.MAP) {
                iArr2[i9] = i8;
                i9++;
                c = 18;
            } else {
                c = 18;
                if (fieldType2.m3972id() >= 18) {
                    if (fieldType2.m3972id() <= 49) {
                        iArr5[i10] = (int) o0oo0oo0.OooOOO(field);
                        i10++;
                    }
                }
                i7++;
                i8 += 3;
                o00o0000Arr = o00o0000Arr2;
                i2 = i12;
                objArr = objArr2;
                i = i3;
                iArr3 = iArr;
                iArr4 = iArr2;
            }
            i7++;
            i8 += 3;
            o00o0000Arr = o00o0000Arr2;
            i2 = i12;
            objArr = objArr2;
            i = i3;
            iArr3 = iArr;
            iArr4 = iArr2;
        }
        int i16 = i;
        int i17 = i2;
        Object[] objArr3 = objArr;
        int[] iArr8 = iArr3;
        int[] iArr9 = iArr4;
        int[] iArr10 = iArr9 == null ? iArr6 : iArr9;
        if (iArr5 == null) {
            iArr5 = iArr6;
        }
        int[] iArr11 = new int[iArr7.length + iArr10.length + iArr5.length];
        System.arraycopy(iArr7, 0, iArr11, 0, iArr7.length);
        System.arraycopy(iArr10, 0, iArr11, iArr7.length, iArr10.length);
        System.arraycopy(iArr5, 0, iArr11, iArr7.length + iArr10.length, iArr5.length);
        return new o0oOOo(iArr8, objArr3, i16, i17, o0o0oo00.f28340OooO0o0, true, iArr11, iArr7.length, iArr7.length + iArr10.length, o0o0000o, o00oo0o0, o0oo00o0, o000o002, o00oooo0);
    }

    public static long OooOoOO(int i) {
        return i & 1048575;
    }

    public static long OooOoo(MessageLite messageLite, long j) {
        return ((Long) o0OO.f28347OooO0OO.OooOOO0(messageLite, j)).longValue();
    }

    public static int OooOoo0(MessageLite messageLite, long j) {
        return ((Integer) o0OO.f28347OooO0OO.OooOOO0(messageLite, j)).intValue();
    }

    public static java.lang.reflect.Field Oooo0o0(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbOooOoO0 = OooO0oO.OooOo.OooOoO0("Field ", str, " for ");
            sbOooOoO0.append(cls.getName());
            sbOooOoO0.append(" not found. Known fields are ");
            sbOooOoO0.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbOooOoO0.toString());
        }
    }

    public static int OoooO0(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void o000oOoO(int i, Object obj, oO0000O oo0000o) throws IOException {
        if (obj instanceof String) {
            ((o0000oo) oo0000o).f28210OooO00o.writeString(i, (String) obj);
        } else {
            ((o0000oo) oo0000o).OooO00o(i, (ByteString) obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02e7  */
    @Override // com.google.protobuf.o0oO0O0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO00o(com.google.protobuf.MessageLite r14, com.google.protobuf.oO0000O r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.o0oOOo.OooO00o(com.google.protobuf.MessageLite, com.google.protobuf.oO0000O):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01cc A[PHI: r12
  0x01cc: PHI (r12v60 sun.misc.Unsafe) = 
  (r12v27 sun.misc.Unsafe)
  (r12v28 sun.misc.Unsafe)
  (r12v29 sun.misc.Unsafe)
  (r12v33 sun.misc.Unsafe)
  (r12v35 sun.misc.Unsafe)
  (r12v36 sun.misc.Unsafe)
  (r12v37 sun.misc.Unsafe)
  (r12v40 sun.misc.Unsafe)
  (r12v42 sun.misc.Unsafe)
  (r12v61 sun.misc.Unsafe)
 binds: [B:248:0x05ab, B:244:0x058f, B:240:0x0573, B:212:0x04e2, B:193:0x0479, B:189:0x045e, B:185:0x0443, B:179:0x040c, B:174:0x03ee, B:88:0x01ca] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.protobuf.o0oO0O0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooO0O0(com.google.protobuf.AbstractMessageLite r19) {
        /*
            Method dump skipped, instructions count: 2050
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.o0oOOo.OooO0O0(com.google.protobuf.AbstractMessageLite):int");
    }

    @Override // com.google.protobuf.o0oO0O0o
    public final void OooO0OO(Object obj, o000OOo o000ooo2, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
        extensionRegistryLite.getClass();
        OooO0oo(obj);
        OooOOoo(this.f28419OooOOO, this.f28421OooOOOO, obj, o000ooo2, extensionRegistryLite);
    }

    @Override // com.google.protobuf.o0oO0O0o
    public final void OooO0Oo(Object obj, byte[] bArr, int i, int i2, OooOO0O oooOO0O) {
        OooOooo(obj, bArr, i, i2, 0, oooOO0O);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // com.google.protobuf.o0oO0O0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooO0o(com.google.protobuf.GeneratedMessageLite r12, com.google.protobuf.GeneratedMessageLite r13) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.o0oOOo.OooO0o(com.google.protobuf.GeneratedMessageLite, com.google.protobuf.GeneratedMessageLite):boolean");
    }

    @Override // com.google.protobuf.o0oO0O0o
    public final int OooO0o0(GeneratedMessageLite generatedMessageLite) {
        int i;
        int iHashLong;
        int[] iArr = this.f28409OooO00o;
        int length = iArr.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iOoooO0O = OoooO0O(i3);
            int i4 = iArr[i3];
            long j = 1048575 & iOoooO0O;
            int iHashCode = 37;
            switch (OoooO0(iOoooO0O)) {
                case 0:
                    i = i2 * 53;
                    iHashLong = Internal.hashLong(Double.doubleToLongBits(o0OO.f28347OooO0OO.OooO0oo(generatedMessageLite, j)));
                    i2 = iHashLong + i;
                    break;
                case 1:
                    i = i2 * 53;
                    iHashLong = Float.floatToIntBits(o0OO.f28347OooO0OO.OooO(generatedMessageLite, j));
                    i2 = iHashLong + i;
                    break;
                case 2:
                    i = i2 * 53;
                    iHashLong = Internal.hashLong(o0OO.f28347OooO0OO.OooOO0o(generatedMessageLite, j));
                    i2 = iHashLong + i;
                    break;
                case 3:
                    i = i2 * 53;
                    iHashLong = Internal.hashLong(o0OO.f28347OooO0OO.OooOO0o(generatedMessageLite, j));
                    i2 = iHashLong + i;
                    break;
                case 4:
                    i = i2 * 53;
                    iHashLong = o0OO.f28347OooO0OO.OooOO0(generatedMessageLite, j);
                    i2 = iHashLong + i;
                    break;
                case 5:
                    i = i2 * 53;
                    iHashLong = Internal.hashLong(o0OO.f28347OooO0OO.OooOO0o(generatedMessageLite, j));
                    i2 = iHashLong + i;
                    break;
                case 6:
                    i = i2 * 53;
                    iHashLong = o0OO.f28347OooO0OO.OooOO0(generatedMessageLite, j);
                    i2 = iHashLong + i;
                    break;
                case 7:
                    i = i2 * 53;
                    iHashLong = Internal.hashBoolean(o0OO.f28347OooO0OO.OooO0o0(generatedMessageLite, j));
                    i2 = iHashLong + i;
                    break;
                case 8:
                    i = i2 * 53;
                    iHashLong = ((String) o0OO.f28347OooO0OO.OooOOO0(generatedMessageLite, j)).hashCode();
                    i2 = iHashLong + i;
                    break;
                case 9:
                    Object objOooOOO0 = o0OO.f28347OooO0OO.OooOOO0(generatedMessageLite, j);
                    if (objOooOOO0 != null) {
                        iHashCode = objOooOOO0.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iHashLong = o0OO.f28347OooO0OO.OooOOO0(generatedMessageLite, j).hashCode();
                    i2 = iHashLong + i;
                    break;
                case 11:
                    i = i2 * 53;
                    iHashLong = o0OO.f28347OooO0OO.OooOO0(generatedMessageLite, j);
                    i2 = iHashLong + i;
                    break;
                case 12:
                    i = i2 * 53;
                    iHashLong = o0OO.f28347OooO0OO.OooOO0(generatedMessageLite, j);
                    i2 = iHashLong + i;
                    break;
                case 13:
                    i = i2 * 53;
                    iHashLong = o0OO.f28347OooO0OO.OooOO0(generatedMessageLite, j);
                    i2 = iHashLong + i;
                    break;
                case 14:
                    i = i2 * 53;
                    iHashLong = Internal.hashLong(o0OO.f28347OooO0OO.OooOO0o(generatedMessageLite, j));
                    i2 = iHashLong + i;
                    break;
                case 15:
                    i = i2 * 53;
                    iHashLong = o0OO.f28347OooO0OO.OooOO0(generatedMessageLite, j);
                    i2 = iHashLong + i;
                    break;
                case 16:
                    i = i2 * 53;
                    iHashLong = Internal.hashLong(o0OO.f28347OooO0OO.OooOO0o(generatedMessageLite, j));
                    i2 = iHashLong + i;
                    break;
                case 17:
                    Object objOooOOO02 = o0OO.f28347OooO0OO.OooOOO0(generatedMessageLite, j);
                    if (objOooOOO02 != null) {
                        iHashCode = objOooOOO02.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    i = i2 * 53;
                    iHashLong = o0OO.f28347OooO0OO.OooOOO0(generatedMessageLite, j).hashCode();
                    i2 = iHashLong + i;
                    break;
                case 50:
                    i = i2 * 53;
                    iHashLong = o0OO.f28347OooO0OO.OooOOO0(generatedMessageLite, j).hashCode();
                    i2 = iHashLong + i;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (OooOOo(generatedMessageLite, i4, i3)) {
                        i = i2 * 53;
                        iHashLong = Internal.hashLong(Double.doubleToLongBits(((Double) o0OO.f28347OooO0OO.OooOOO0(generatedMessageLite, j)).doubleValue()));
                        i2 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (OooOOo(generatedMessageLite, i4, i3)) {
                        i = i2 * 53;
                        iHashLong = Float.floatToIntBits(((Float) o0OO.f28347OooO0OO.OooOOO0(generatedMessageLite, j)).floatValue());
                        i2 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (OooOOo(generatedMessageLite, i4, i3)) {
                        i = i2 * 53;
                        iHashLong = Internal.hashLong(OooOoo(generatedMessageLite, j));
                        i2 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (OooOOo(generatedMessageLite, i4, i3)) {
                        i = i2 * 53;
                        iHashLong = Internal.hashLong(OooOoo(generatedMessageLite, j));
                        i2 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (OooOOo(generatedMessageLite, i4, i3)) {
                        i = i2 * 53;
                        iHashLong = OooOoo0(generatedMessageLite, j);
                        i2 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (OooOOo(generatedMessageLite, i4, i3)) {
                        i = i2 * 53;
                        iHashLong = Internal.hashLong(OooOoo(generatedMessageLite, j));
                        i2 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (OooOOo(generatedMessageLite, i4, i3)) {
                        i = i2 * 53;
                        iHashLong = OooOoo0(generatedMessageLite, j);
                        i2 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (OooOOo(generatedMessageLite, i4, i3)) {
                        i = i2 * 53;
                        iHashLong = Internal.hashBoolean(((Boolean) o0OO.f28347OooO0OO.OooOOO0(generatedMessageLite, j)).booleanValue());
                        i2 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (OooOOo(generatedMessageLite, i4, i3)) {
                        i = i2 * 53;
                        iHashLong = ((String) o0OO.f28347OooO0OO.OooOOO0(generatedMessageLite, j)).hashCode();
                        i2 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    if (OooOOo(generatedMessageLite, i4, i3)) {
                        i = i2 * 53;
                        iHashLong = o0OO.f28347OooO0OO.OooOOO0(generatedMessageLite, j).hashCode();
                        i2 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (OooOOo(generatedMessageLite, i4, i3)) {
                        i = i2 * 53;
                        iHashLong = o0OO.f28347OooO0OO.OooOOO0(generatedMessageLite, j).hashCode();
                        i2 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case IronSourceConstants.RETRY_LIMIT /* 62 */:
                    if (OooOOo(generatedMessageLite, i4, i3)) {
                        i = i2 * 53;
                        iHashLong = OooOoo0(generatedMessageLite, j);
                        i2 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (OooOOo(generatedMessageLite, i4, i3)) {
                        i = i2 * 53;
                        iHashLong = OooOoo0(generatedMessageLite, j);
                        i2 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (OooOOo(generatedMessageLite, i4, i3)) {
                        i = i2 * 53;
                        iHashLong = OooOoo0(generatedMessageLite, j);
                        i2 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (OooOOo(generatedMessageLite, i4, i3)) {
                        i = i2 * 53;
                        iHashLong = Internal.hashLong(OooOoo(generatedMessageLite, j));
                        i2 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (OooOOo(generatedMessageLite, i4, i3)) {
                        i = i2 * 53;
                        iHashLong = OooOoo0(generatedMessageLite, j);
                        i2 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (OooOOo(generatedMessageLite, i4, i3)) {
                        i = i2 * 53;
                        iHashLong = Internal.hashLong(OooOoo(generatedMessageLite, j));
                        i2 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (OooOOo(generatedMessageLite, i4, i3)) {
                        i = i2 * 53;
                        iHashLong = o0OO.f28347OooO0OO.OooOOO0(generatedMessageLite, j).hashCode();
                        i2 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        ((o0OO0) this.f28419OooOOO).getClass();
        int iHashCode2 = generatedMessageLite.unknownFields.hashCode() + (i2 * 53);
        if (!this.f28413OooO0o) {
            return iHashCode2;
        }
        ((o000O0) this.f28421OooOOOO).getClass();
        return ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions.f28237OooO00o.hashCode() + (iHashCode2 * 53);
    }

    public final boolean OooO0oO(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, int i) {
        return OooOOOO(generatedMessageLite, i) == OooOOOO(generatedMessageLite2, i);
    }

    public final Object OooOO0(Object obj, int i, Object obj2, o0OO00o0 o0oo00o0, Object obj3) {
        Internal.EnumVerifier enumVerifierOooOO0O;
        int i2 = this.f28409OooO00o[i];
        Object objOooOOO0 = o0OO.f28347OooO0OO.OooOOO0(obj, OoooO0O(i) & 1048575);
        if (objOooOOO0 == null || (enumVerifierOooOO0O = OooOO0O(i)) == null) {
            return obj2;
        }
        this.f28422OooOOOo.getClass();
        o0o0Oo metadata = ((MapEntryLite) OooOO0o(i)).getMetadata();
        Iterator it = ((MapFieldLite) objOooOOO0).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!enumVerifierOooOO0O.isInRange(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = o0oo00o0.OooO00o(obj3);
                }
                o00Oo0 o00oo0NewCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(metadata, entry.getKey(), entry.getValue()));
                try {
                    MapEntryLite.writeTo(o00oo0NewCodedBuilder.f28280OooO00o, metadata, entry.getKey(), entry.getValue());
                    o00oo0NewCodedBuilder.f28280OooO00o.checkNoSpaceLeft();
                    oo000o oo000oVar = new oo000o(o00oo0NewCodedBuilder.f28281OooO0O0);
                    ((o0OO0) o0oo00o0).getClass();
                    ((UnknownFieldSetLite) obj2).storeField(WireFormat.makeTag(i2, 2), oo000oVar);
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    public final Internal.EnumVerifier OooOO0O(int i) {
        return (Internal.EnumVerifier) this.f28410OooO0O0[OooO0oO.OooOo.OooOoOO(i, 3, 2, 1)];
    }

    public final Object OooOO0o(int i) {
        return this.f28410OooO0O0[(i / 3) * 2];
    }

    public final o0oO0O0o OooOOO0(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.f28410OooO0O0;
        o0oO0O0o o0oo0o0o = (o0oO0O0o) objArr[i2];
        if (o0oo0o0o != null) {
            return o0oo0o0o;
        }
        o0oO0O0o o0oo0o0oOooO00o = o0O00O.f28290OooO0OO.OooO00o((Class) objArr[i2 + 1]);
        objArr[i2] = o0oo0o0oOooO00o;
        return o0oo0o0oOooO00o;
    }

    public final boolean OooOOOO(Object obj, int i) {
        int i2 = this.f28409OooO00o[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int iOoooO0O = OoooO0O(i);
            long j2 = iOoooO0O & 1048575;
            switch (OoooO0(iOoooO0O)) {
                case 0:
                    if (Double.doubleToRawLongBits(o0OO.f28347OooO0OO.OooO0oo(obj, j2)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(o0OO.f28347OooO0OO.OooO(obj, j2)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (o0OO.f28347OooO0OO.OooOO0o(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (o0OO.f28347OooO0OO.OooOO0o(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (o0OO.f28347OooO0OO.OooOO0(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (o0OO.f28347OooO0OO.OooOO0o(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (o0OO.f28347OooO0OO.OooOO0(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return o0OO.f28347OooO0OO.OooO0o0(obj, j2);
                case 8:
                    Object objOooOOO0 = o0OO.f28347OooO0OO.OooOOO0(obj, j2);
                    if (objOooOOO0 instanceof String) {
                        return !((String) objOooOOO0).isEmpty();
                    }
                    if (objOooOOO0 instanceof ByteString) {
                        return !ByteString.EMPTY.equals(objOooOOO0);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (o0OO.f28347OooO0OO.OooOOO0(obj, j2) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !ByteString.EMPTY.equals(o0OO.f28347OooO0OO.OooOOO0(obj, j2));
                case 11:
                    if (o0OO.f28347OooO0OO.OooOO0(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (o0OO.f28347OooO0OO.OooOO0(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (o0OO.f28347OooO0OO.OooOO0(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (o0OO.f28347OooO0OO.OooOO0o(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (o0OO.f28347OooO0OO.OooOO0(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (o0OO.f28347OooO0OO.OooOO0o(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (o0OO.f28347OooO0OO.OooOOO0(obj, j2) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((o0OO.f28347OooO0OO.OooOO0(obj, j) & (1 << (i2 >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean OooOOOo(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? OooOOOO(obj, i) : (i3 & i4) != 0;
    }

    public final boolean OooOOo(Object obj, int i, int i2) {
        return o0OO.f28347OooO0OO.OooOO0(obj, (long) (this.f28409OooO00o[i2 + 2] & 1048575)) == i;
    }

    /* JADX WARN: Removed duplicated region for block: B:269:0x0898 A[Catch: all -> 0x089f, TryCatch #43 {all -> 0x089f, blocks: (B:267:0x0893, B:269:0x0898, B:273:0x08a2), top: B:331:0x0893 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x08d7 A[LOOP:2: B:288:0x08d5->B:289:0x08d7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x08ea  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x08a8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOOoo(com.google.protobuf.o0OO00o0 r20, com.google.protobuf.o000O00 r21, java.lang.Object r22, com.google.protobuf.o000OOo r23, com.google.protobuf.ExtensionRegistryLite r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.o0oOOo.OooOOoo(com.google.protobuf.o0OO00o0, com.google.protobuf.o000O00, java.lang.Object, com.google.protobuf.o000OOo, com.google.protobuf.ExtensionRegistryLite):void");
    }

    public final Object OooOo(Object obj, int i, int i2) {
        o0oO0O0o o0oo0o0oOooOOO0 = OooOOO0(i2);
        if (!OooOOo(obj, i, i2)) {
            return o0oo0o0oOooOOO0.newInstance();
        }
        Object object = f28406OooOOo.getObject(obj, OoooO0O(i2) & 1048575);
        if (OooOOo0(object)) {
            return object;
        }
        Object objNewInstance = o0oo0o0oOooOOO0.newInstance();
        if (object != null) {
            o0oo0o0oOooOOO0.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    public final void OooOo0(Object obj, Object obj2, int i) {
        if (OooOOOO(obj2, i)) {
            long jOoooO0O = OoooO0O(i) & 1048575;
            Unsafe unsafe = f28406OooOOo;
            Object object = unsafe.getObject(obj2, jOoooO0O);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f28409OooO00o[i] + " is present but null: " + obj2);
            }
            o0oO0O0o o0oo0o0oOooOOO0 = OooOOO0(i);
            if (!OooOOOO(obj, i)) {
                if (OooOOo0(object)) {
                    Object objNewInstance = o0oo0o0oOooOOO0.newInstance();
                    o0oo0o0oOooOOO0.mergeFrom(objNewInstance, object);
                    unsafe.putObject(obj, jOoooO0O, objNewInstance);
                } else {
                    unsafe.putObject(obj, jOoooO0O, object);
                }
                Oooo0o(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jOoooO0O);
            if (!OooOOo0(object2)) {
                Object objNewInstance2 = o0oo0o0oOooOOO0.newInstance();
                o0oo0o0oOooOOO0.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(obj, jOoooO0O, objNewInstance2);
                object2 = objNewInstance2;
            }
            o0oo0o0oOooOOO0.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
    
        r10.put(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
    
        r0.popLimit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOo00(java.lang.Object r9, int r10, java.lang.Object r11, com.google.protobuf.ExtensionRegistryLite r12, com.google.protobuf.o000OOo r13) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            r8 = this;
            int r10 = r8.OoooO0O(r10)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r0
            long r0 = (long) r10
            com.google.protobuf.o0OO0oO0 r10 = com.google.protobuf.o0OO.f28347OooO0OO
            java.lang.Object r10 = r10.OooOOO0(r9, r0)
            com.google.protobuf.o00OOOO0 r2 = r8.f28422OooOOOo
            if (r10 != 0) goto L22
            r2.getClass()
            com.google.protobuf.MapFieldLite r10 = com.google.protobuf.MapFieldLite.emptyMapField()
            com.google.protobuf.MapFieldLite r10 = r10.mutableCopy()
            com.google.protobuf.o0OO.OooOOoo(r9, r0, r10)
            goto L3d
        L22:
            r2.getClass()
            r3 = r10
            com.google.protobuf.MapFieldLite r3 = (com.google.protobuf.MapFieldLite) r3
            boolean r3 = r3.isMutable()
            if (r3 != 0) goto L3d
            com.google.protobuf.MapFieldLite r3 = com.google.protobuf.MapFieldLite.emptyMapField()
            com.google.protobuf.MapFieldLite r3 = r3.mutableCopy()
            com.google.protobuf.o00OOOO0.OooO00o(r3, r10)
            com.google.protobuf.o0OO.OooOOoo(r9, r0, r3)
            r10 = r3
        L3d:
            r2.getClass()
            com.google.protobuf.MapFieldLite r10 = (com.google.protobuf.MapFieldLite) r10
            com.google.protobuf.MapEntryLite r11 = (com.google.protobuf.MapEntryLite) r11
            com.google.protobuf.o0o0Oo r9 = r11.getMetadata()
            r11 = 2
            r13.OooOo(r11)
            com.google.protobuf.CodedInputStream r0 = r13.f28219OooO00o
            int r1 = r0.readUInt32()
            int r1 = r0.pushLimit(r1)
            java.lang.Object r2 = r9.f28401OooO0O0
            java.lang.Object r3 = r9.f28403OooO0Oo
            r4 = r3
        L5b:
            int r5 = r13.OooO00o()     // Catch: java.lang.Throwable -> L7f
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r6) goto La1
            boolean r6 = r0.isAtEnd()     // Catch: java.lang.Throwable -> L7f
            if (r6 == 0) goto L6b
            goto La1
        L6b:
            r6 = 1
            java.lang.String r7 = "Unable to parse map entry."
            if (r5 == r6) goto L8c
            if (r5 == r11) goto L81
            boolean r5 = r13.OooOoO0()     // Catch: java.lang.Throwable -> L7f com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L94
            if (r5 == 0) goto L79
            goto L5b
        L79:
            com.google.protobuf.InvalidProtocolBufferException r5 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L7f com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L94
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L7f com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L94
            throw r5     // Catch: java.lang.Throwable -> L7f com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L94
        L7f:
            r9 = move-exception
            goto La8
        L81:
            com.google.protobuf.WireFormat$FieldType r5 = r9.f28402OooO0OO     // Catch: java.lang.Throwable -> L7f com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L94
            java.lang.Class r6 = r3.getClass()     // Catch: java.lang.Throwable -> L7f com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L94
            java.lang.Object r4 = r13.OooO(r5, r6, r12)     // Catch: java.lang.Throwable -> L7f com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L94
            goto L5b
        L8c:
            com.google.protobuf.WireFormat$FieldType r5 = r9.f28400OooO00o     // Catch: java.lang.Throwable -> L7f com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L94
            r6 = 0
            java.lang.Object r2 = r13.OooO(r5, r6, r6)     // Catch: java.lang.Throwable -> L7f com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L94
            goto L5b
        L94:
            boolean r5 = r13.OooOoO0()     // Catch: java.lang.Throwable -> L7f
            if (r5 == 0) goto L9b
            goto L5b
        L9b:
            com.google.protobuf.InvalidProtocolBufferException r9 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L7f
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L7f
            throw r9     // Catch: java.lang.Throwable -> L7f
        La1:
            r10.put(r2, r4)     // Catch: java.lang.Throwable -> L7f
            r0.popLimit(r1)
            return
        La8:
            r0.popLimit(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.o0oOOo.OooOo00(java.lang.Object, int, java.lang.Object, com.google.protobuf.ExtensionRegistryLite, com.google.protobuf.o000OOo):void");
    }

    public final void OooOo0O(Object obj, Object obj2, int i) {
        int[] iArr = this.f28409OooO00o;
        int i2 = iArr[i];
        if (OooOOo(obj2, i2, i)) {
            long jOoooO0O = OoooO0O(i) & 1048575;
            Unsafe unsafe = f28406OooOOo;
            Object object = unsafe.getObject(obj2, jOoooO0O);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            o0oO0O0o o0oo0o0oOooOOO0 = OooOOO0(i);
            if (!OooOOo(obj, i2, i)) {
                if (OooOOo0(object)) {
                    Object objNewInstance = o0oo0o0oOooOOO0.newInstance();
                    o0oo0o0oOooOOO0.mergeFrom(objNewInstance, object);
                    unsafe.putObject(obj, jOoooO0O, objNewInstance);
                } else {
                    unsafe.putObject(obj, jOoooO0O, object);
                }
                Oooo0oO(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jOoooO0O);
            if (!OooOOo0(object2)) {
                Object objNewInstance2 = o0oo0o0oOooOOO0.newInstance();
                o0oo0o0oOooOOO0.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(obj, jOoooO0O, objNewInstance2);
                object2 = objNewInstance2;
            }
            o0oo0o0oOooOOO0.mergeFrom(object2, object);
        }
    }

    public final Object OooOo0o(Object obj, int i) {
        o0oO0O0o o0oo0o0oOooOOO0 = OooOOO0(i);
        long jOoooO0O = OoooO0O(i) & 1048575;
        if (!OooOOOO(obj, i)) {
            return o0oo0o0oOooOOO0.newInstance();
        }
        Object object = f28406OooOOo.getObject(obj, jOoooO0O);
        if (OooOOo0(object)) {
            return object;
        }
        Object objNewInstance = o0oo0o0oOooOOO0.newInstance();
        if (object != null) {
            o0oo0o0oOooOOO0.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    public final int OooOooO(Object obj, byte[] bArr, int i, int i2, int i3, long j, OooOO0O oooOO0O) throws InvalidProtocolBufferException {
        int iOooO;
        Unsafe unsafe = f28406OooOOo;
        Object objOooOO0o = OooOO0o(i3);
        Object object = unsafe.getObject(obj, j);
        this.f28422OooOOOo.getClass();
        if (!((MapFieldLite) object).isMutable()) {
            MapFieldLite mapFieldLiteMutableCopy = MapFieldLite.emptyMapField().mutableCopy();
            o00OOOO0.OooO00o(mapFieldLiteMutableCopy, object);
            unsafe.putObject(obj, j, mapFieldLiteMutableCopy);
            object = mapFieldLiteMutableCopy;
        }
        o0o0Oo metadata = ((MapEntryLite) objOooOO0o).getMetadata();
        MapFieldLite mapFieldLite = (MapFieldLite) object;
        int iOooOOo = OooOOO0.OooOOo(bArr, i, oooOO0O);
        int i4 = oooOO0O.f28163OooO00o;
        if (i4 < 0 || i4 > i2 - iOooOOo) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i5 = iOooOOo + i4;
        Object obj2 = metadata.f28401OooO0O0;
        Object obj3 = metadata.f28403OooO0Oo;
        Object obj4 = obj2;
        Object obj5 = obj3;
        while (iOooOOo < i5) {
            int iOooOOo0 = iOooOOo + 1;
            int i6 = bArr[iOooOOo];
            if (i6 < 0) {
                iOooOOo0 = OooOOO0.OooOOo0(i6, bArr, iOooOOo0, oooOO0O);
                i6 = oooOO0O.f28163OooO00o;
            }
            int i7 = i6 >>> 3;
            int i8 = i6 & 7;
            if (i7 != 1) {
                if (i7 == 2 && i8 == metadata.f28402OooO0OO.getWireType()) {
                    iOooO = OooO(bArr, iOooOOo0, i2, metadata.f28402OooO0OO, obj3.getClass(), oooOO0O);
                    obj5 = oooOO0O.f28165OooO0OO;
                    iOooOOo = iOooO;
                } else {
                    iOooOOo = OooOOO0.OooOo0o(i6, bArr, iOooOOo0, i2, oooOO0O);
                }
            } else if (i8 == metadata.f28400OooO00o.getWireType()) {
                iOooO = OooO(bArr, iOooOOo0, i2, metadata.f28400OooO00o, null, oooOO0O);
                obj4 = oooOO0O.f28165OooO0OO;
                iOooOOo = iOooO;
            } else {
                iOooOOo = OooOOO0.OooOo0o(i6, bArr, iOooOOo0, i2, oooOO0O);
            }
        }
        if (iOooOOo != i5) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        mapFieldLite.put(obj4, obj5);
        return i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x04b3, code lost:
    
        r0 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x07eb, code lost:
    
        if (r0 == 1048575) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x07ed, code lost:
    
        r25.putInt(r10, r0, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x07f3, code lost:
    
        r3 = null;
        r9 = r8.f28417OooOO0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x07fa, code lost:
    
        if (r9 >= r8.f28418OooOO0O) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x07fc, code lost:
    
        r3 = (com.google.protobuf.UnknownFieldSetLite) r8.OooOO0(r10, r8.f28408OooO[r9], r3, r8.f28419OooOOO, r34);
        r9 = r9 + 1;
        r10 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0812, code lost:
    
        r0 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0813, code lost:
    
        if (r3 == null) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0815, code lost:
    
        ((com.google.protobuf.o0OO0) r0.f28419OooOOO).getClass();
        ((com.google.protobuf.GeneratedMessageLite) r34).unknownFields = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0822, code lost:
    
        if (r38 != 0) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0824, code lost:
    
        if (r7 != r6) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x082b, code lost:
    
        throw com.google.protobuf.InvalidProtocolBufferException.parseFailure();
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x082c, code lost:
    
        if (r7 > r6) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x082e, code lost:
    
        if (r14 != r38) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0830, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0835, code lost:
    
        throw com.google.protobuf.InvalidProtocolBufferException.parseFailure();
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x07b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooOooo(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.protobuf.OooOO0O r39) {
        /*
            Method dump skipped, instructions count: 2214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.o0oOOo.OooOooo(java.lang.Object, byte[], int, int, int, com.google.protobuf.OooOO0O):int");
    }

    public final void Oooo(Object obj, int i, Object obj2) {
        f28406OooOOo.putObject(obj, OoooO0O(i) & 1048575, obj2);
        Oooo0o(obj, i);
    }

    public final void Oooo0(Object obj, int i, o000OOo o000ooo2, o0oO0O0o o0oo0o0o, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int tag;
        List listOooO0OO = this.f28420OooOOO0.OooO0OO(obj, i & 1048575);
        if (WireFormat.getTagWireType(o000ooo2.f28220OooO0O0) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int i2 = o000ooo2.f28220OooO0O0;
        do {
            Object objNewInstance = o0oo0o0o.newInstance();
            o000ooo2.OooO0OO(objNewInstance, o0oo0o0o, extensionRegistryLite);
            o0oo0o0o.makeImmutable(objNewInstance);
            listOooO0OO.add(objNewInstance);
            CodedInputStream codedInputStream = o000ooo2.f28219OooO00o;
            if (codedInputStream.isAtEnd() || o000ooo2.f28222OooO0Oo != 0) {
                return;
            } else {
                tag = codedInputStream.readTag();
            }
        } while (tag == i2);
        o000ooo2.f28222OooO0Oo = tag;
    }

    public final int Oooo000(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, OooOO0O oooOO0O) throws InvalidProtocolBufferException {
        Unsafe unsafe = f28406OooOOo;
        long j2 = this.f28409OooO00o[i8 + 2] & 1048575;
        switch (i7) {
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(OooOOO0.OooO0OO(bArr, i))));
                int i9 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i9;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(OooOOO0.OooO0O0(bArr, i))));
                int i10 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i10;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iOooOo00 = OooOOO0.OooOo00(bArr, i, oooOO0O);
                unsafe.putObject(obj, j, Long.valueOf(oooOO0O.f28164OooO0O0));
                unsafe.putInt(obj, j2, i4);
                return iOooOo00;
            case 55:
            case IronSourceConstants.RETRY_LIMIT /* 62 */:
                if (i5 != 0) {
                    return i;
                }
                int iOooOOo = OooOOO0.OooOOo(bArr, i, oooOO0O);
                unsafe.putObject(obj, j, Integer.valueOf(oooOO0O.f28163OooO00o));
                unsafe.putInt(obj, j2, i4);
                return iOooOOo;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(OooOOO0.OooO0OO(bArr, i)));
                int i11 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(OooOOO0.OooO0O0(bArr, i)));
                int i12 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i12;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iOooOo002 = OooOOO0.OooOo00(bArr, i, oooOO0O);
                unsafe.putObject(obj, j, Boolean.valueOf(oooOO0O.f28164OooO0O0 != 0));
                unsafe.putInt(obj, j2, i4);
                return iOooOo002;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iOooOOo2 = OooOOO0.OooOOo(bArr, i, oooOO0O);
                int i13 = oooOO0O.f28163OooO00o;
                if (i13 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0) {
                        if (!o0OOO0OO.f28370OooO00o.OooOO0(bArr, iOooOOo2, iOooOOo2 + i13)) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, iOooOOo2, i13, Internal.UTF_8));
                    iOooOOo2 += i13;
                }
                unsafe.putInt(obj, j2, i4);
                return iOooOOo2;
            case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                if (i5 != 2) {
                    return i;
                }
                Object objOooOo = OooOo(obj, i4, i8);
                int iOooOo0O = OooOOO0.OooOo0O(objOooOo, OooOOO0(i8), bArr, i, i2, oooOO0O);
                OoooO00(obj, i4, i8, objOooOo);
                return iOooOo0O;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int iOooO00o = OooOOO0.OooO00o(bArr, i, oooOO0O);
                unsafe.putObject(obj, j, oooOO0O.f28165OooO0OO);
                unsafe.putInt(obj, j2, i4);
                return iOooO00o;
            case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                if (i5 != 0) {
                    return i;
                }
                int iOooOOo3 = OooOOO0.OooOOo(bArr, i, oooOO0O);
                int i14 = oooOO0O.f28163OooO00o;
                Internal.EnumVerifier enumVerifierOooOO0O = OooOO0O(i8);
                if (enumVerifierOooOO0O != null && !enumVerifierOooOO0O.isInRange(i14)) {
                    OooOOO(obj).storeField(i3, Long.valueOf(i14));
                    return iOooOOo3;
                }
                unsafe.putObject(obj, j, Integer.valueOf(i14));
                unsafe.putInt(obj, j2, i4);
                return iOooOOo3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int iOooOOo4 = OooOOO0.OooOOo(bArr, i, oooOO0O);
                unsafe.putObject(obj, j, Integer.valueOf(CodedInputStream.decodeZigZag32(oooOO0O.f28163OooO00o)));
                unsafe.putInt(obj, j2, i4);
                return iOooOOo4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int iOooOo003 = OooOOO0.OooOo00(bArr, i, oooOO0O);
                unsafe.putObject(obj, j, Long.valueOf(CodedInputStream.decodeZigZag64(oooOO0O.f28164OooO0O0)));
                unsafe.putInt(obj, j2, i4);
                return iOooOo003;
            case 68:
                if (i5 == 3) {
                    Object objOooOo2 = OooOo(obj, i4, i8);
                    int iOooOo0 = OooOOO0.OooOo0(objOooOo2, OooOOO0(i8), bArr, i, i2, (i3 & (-8)) | 4, oooOO0O);
                    OoooO00(obj, i4, i8, objOooOo2);
                    return iOooOo0;
                }
                break;
        }
        return i;
    }

    public final int Oooo00O(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, OooOO0O oooOO0O) throws InvalidProtocolBufferException {
        int i8;
        int iOooOOoo;
        Unsafe unsafe = f28406OooOOo;
        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe.getObject(obj, j2);
        if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
            int size = protobufListMutableCopyWithCapacity2.size();
            protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j2, protobufListMutableCopyWithCapacity2);
        }
        Internal.ProtobufList protobufList = protobufListMutableCopyWithCapacity2;
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return OooOOO0.OooO0oo(bArr, i, protobufList, oooOO0O);
                }
                if (i5 != 1) {
                    return i;
                }
                o0000O0 o0000o02 = (o0000O0) protobufList;
                o0000o02.addDouble(Double.longBitsToDouble(OooOOO0.OooO0OO(bArr, i)));
                int i9 = i + 8;
                while (i9 < i2) {
                    int iOooOOo = OooOOO0.OooOOo(bArr, i9, oooOO0O);
                    if (i3 != oooOO0O.f28163OooO00o) {
                        return i9;
                    }
                    o0000o02.addDouble(Double.longBitsToDouble(OooOOO0.OooO0OO(bArr, iOooOOo)));
                    i9 = iOooOOo + 8;
                }
                return i9;
            case 19:
            case 36:
                if (i5 == 2) {
                    return OooOOO0.OooOO0O(bArr, i, protobufList, oooOO0O);
                }
                if (i5 != 5) {
                    return i;
                }
                o00O00O o00o00o = (o00O00O) protobufList;
                o00o00o.addFloat(Float.intBitsToFloat(OooOOO0.OooO0O0(bArr, i)));
                int i10 = i + 4;
                while (i10 < i2) {
                    int iOooOOo2 = OooOOO0.OooOOo(bArr, i10, oooOO0O);
                    if (i3 != oooOO0O.f28163OooO00o) {
                        return i10;
                    }
                    o00o00o.addFloat(Float.intBitsToFloat(OooOOO0.OooO0O0(bArr, iOooOOo2)));
                    i10 = iOooOOo2 + 4;
                }
                return i10;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    oo0O oo0o = (oo0O) protobufList;
                    int iOooOOo3 = OooOOO0.OooOOo(bArr, i, oooOO0O);
                    int i11 = oooOO0O.f28163OooO00o + iOooOOo3;
                    while (iOooOOo3 < i11) {
                        iOooOOo3 = OooOOO0.OooOo00(bArr, iOooOOo3, oooOO0O);
                        oo0o.addLong(oooOO0O.f28164OooO0O0);
                    }
                    if (iOooOOo3 == i11) {
                        return iOooOOo3;
                    }
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i5 != 0) {
                    return i;
                }
                oo0O oo0o2 = (oo0O) protobufList;
                int iOooOo00 = OooOOO0.OooOo00(bArr, i, oooOO0O);
                oo0o2.addLong(oooOO0O.f28164OooO0O0);
                while (iOooOo00 < i2) {
                    int iOooOOo4 = OooOOO0.OooOOo(bArr, iOooOo00, oooOO0O);
                    if (i3 != oooOO0O.f28163OooO00o) {
                        return iOooOo00;
                    }
                    iOooOo00 = OooOOO0.OooOo00(bArr, iOooOOo4, oooOO0O);
                    oo0o2.addLong(oooOO0O.f28164OooO0O0);
                }
                return iOooOo00;
            case 22:
            case 29:
            case 39:
            case 43:
                return i5 == 2 ? OooOOO0.OooOOO(bArr, i, protobufList, oooOO0O) : i5 == 0 ? OooOOO0.OooOOoo(i3, bArr, i, i2, protobufList, oooOO0O) : i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return OooOOO0.OooOO0(bArr, i, protobufList, oooOO0O);
                }
                if (i5 != 1) {
                    return i;
                }
                oo0O oo0o3 = (oo0O) protobufList;
                oo0o3.addLong(OooOOO0.OooO0OO(bArr, i));
                int i12 = i + 8;
                while (i12 < i2) {
                    int iOooOOo5 = OooOOO0.OooOOo(bArr, i12, oooOO0O);
                    if (i3 != oooOO0O.f28163OooO00o) {
                        return i12;
                    }
                    oo0o3.addLong(OooOOO0.OooO0OO(bArr, iOooOOo5));
                    i12 = iOooOOo5 + 8;
                }
                return i12;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    return OooOOO0.OooO(bArr, i, protobufList, oooOO0O);
                }
                if (i5 != 5) {
                    return i;
                }
                o00O0O0 o00o0o0 = (o00O0O0) protobufList;
                o00o0o0.addInt(OooOOO0.OooO0O0(bArr, i));
                int i13 = i + 4;
                while (i13 < i2) {
                    int iOooOOo6 = OooOOO0.OooOOo(bArr, i13, oooOO0O);
                    if (i3 != oooOO0O.f28163OooO00o) {
                        return i13;
                    }
                    o00o0o0.addInt(OooOOO0.OooO0O0(bArr, iOooOOo6));
                    i13 = iOooOOo6 + 4;
                }
                return i13;
            case 25:
            case 42:
                if (i5 == 2) {
                    return OooOOO0.OooO0oO(bArr, i, protobufList, oooOO0O);
                }
                if (i5 != 0) {
                    return i;
                }
                OooOOOO oooOOOO = (OooOOOO) protobufList;
                int iOooOo002 = OooOOO0.OooOo00(bArr, i, oooOO0O);
                oooOOOO.addBoolean(oooOO0O.f28164OooO0O0 != 0);
                while (iOooOo002 < i2) {
                    int iOooOOo7 = OooOOO0.OooOOo(bArr, iOooOo002, oooOO0O);
                    if (i3 != oooOO0O.f28163OooO00o) {
                        return iOooOo002;
                    }
                    iOooOo002 = OooOOO0.OooOo00(bArr, iOooOOo7, oooOO0O);
                    oooOOOO.addBoolean(oooOO0O.f28164OooO0O0 != 0);
                }
                return iOooOo002;
            case 26:
                if (i5 != 2) {
                    return i;
                }
                if ((j & 536870912) == 0) {
                    int iOooOOo8 = OooOOO0.OooOOo(bArr, i, oooOO0O);
                    int i14 = oooOO0O.f28163OooO00o;
                    if (i14 < 0) {
                        throw InvalidProtocolBufferException.negativeSize();
                    }
                    if (i14 == 0) {
                        protobufList.add("");
                    } else {
                        protobufList.add(new String(bArr, iOooOOo8, i14, Internal.UTF_8));
                        iOooOOo8 += i14;
                    }
                    while (iOooOOo8 < i2) {
                        int iOooOOo9 = OooOOO0.OooOOo(bArr, iOooOOo8, oooOO0O);
                        if (i3 != oooOO0O.f28163OooO00o) {
                            return iOooOOo8;
                        }
                        iOooOOo8 = OooOOO0.OooOOo(bArr, iOooOOo9, oooOO0O);
                        int i15 = oooOO0O.f28163OooO00o;
                        if (i15 < 0) {
                            throw InvalidProtocolBufferException.negativeSize();
                        }
                        if (i15 == 0) {
                            protobufList.add("");
                        } else {
                            protobufList.add(new String(bArr, iOooOOo8, i15, Internal.UTF_8));
                            iOooOOo8 += i15;
                        }
                    }
                    return iOooOOo8;
                }
                int iOooOOo10 = OooOOO0.OooOOo(bArr, i, oooOO0O);
                int i16 = oooOO0O.f28163OooO00o;
                if (i16 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                if (i16 == 0) {
                    protobufList.add("");
                } else {
                    int i17 = iOooOOo10 + i16;
                    if (!o0OOO0OO.f28370OooO00o.OooOO0(bArr, iOooOOo10, i17)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    protobufList.add(new String(bArr, iOooOOo10, i16, Internal.UTF_8));
                    iOooOOo10 = i17;
                }
                while (iOooOOo10 < i2) {
                    int iOooOOo11 = OooOOO0.OooOOo(bArr, iOooOOo10, oooOO0O);
                    if (i3 != oooOO0O.f28163OooO00o) {
                        return iOooOOo10;
                    }
                    iOooOOo10 = OooOOO0.OooOOo(bArr, iOooOOo11, oooOO0O);
                    int i18 = oooOO0O.f28163OooO00o;
                    if (i18 < 0) {
                        throw InvalidProtocolBufferException.negativeSize();
                    }
                    if (i18 == 0) {
                        protobufList.add("");
                    } else {
                        int i19 = iOooOOo10 + i18;
                        if (!o0OOO0OO.f28370OooO00o.OooOO0(bArr, iOooOOo10, i19)) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        protobufList.add(new String(bArr, iOooOOo10, i18, Internal.UTF_8));
                        iOooOOo10 = i19;
                    }
                }
                return iOooOOo10;
            case 27:
                i8 = i;
                if (i5 == 2) {
                    return OooOOO0.OooO0o(OooOOO0(i6), i3, bArr, i8, i2, protobufList, oooOO0O);
                }
                break;
            case 28:
                i8 = i;
                if (i5 == 2) {
                    int iOooOOo12 = OooOOO0.OooOOo(bArr, i8, oooOO0O);
                    int i20 = oooOO0O.f28163OooO00o;
                    if (i20 < 0) {
                        throw InvalidProtocolBufferException.negativeSize();
                    }
                    if (i20 > bArr.length - iOooOOo12) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    if (i20 == 0) {
                        protobufList.add(ByteString.EMPTY);
                    } else {
                        protobufList.add(ByteString.copyFrom(bArr, iOooOOo12, i20));
                        iOooOOo12 += i20;
                    }
                    while (iOooOOo12 < i2) {
                        int iOooOOo13 = OooOOO0.OooOOo(bArr, iOooOOo12, oooOO0O);
                        if (i3 != oooOO0O.f28163OooO00o) {
                            return iOooOOo12;
                        }
                        iOooOOo12 = OooOOO0.OooOOo(bArr, iOooOOo13, oooOO0O);
                        int i21 = oooOO0O.f28163OooO00o;
                        if (i21 < 0) {
                            throw InvalidProtocolBufferException.negativeSize();
                        }
                        if (i21 > bArr.length - iOooOOo12) {
                            throw InvalidProtocolBufferException.truncatedMessage();
                        }
                        if (i21 == 0) {
                            protobufList.add(ByteString.EMPTY);
                        } else {
                            protobufList.add(ByteString.copyFrom(bArr, iOooOOo12, i21));
                            iOooOOo12 += i21;
                        }
                    }
                    return iOooOOo12;
                }
                break;
            case 30:
            case 44:
                if (i5 == 2) {
                    iOooOOoo = OooOOO0.OooOOO(bArr, i, protobufList, oooOO0O);
                } else {
                    if (i5 != 0) {
                        return i;
                    }
                    iOooOOoo = OooOOO0.OooOOoo(i3, bArr, i, i2, protobufList, oooOO0O);
                }
                o0O0oo0o.OooOO0O(obj, i4, protobufList, OooOO0O(i6), null, this.f28419OooOOO);
                return iOooOOoo;
            case 33:
            case 47:
                if (i5 == 2) {
                    return OooOOO0.OooOO0o(bArr, i, protobufList, oooOO0O);
                }
                if (i5 != 0) {
                    return i;
                }
                o00O0O0 o00o0o02 = (o00O0O0) protobufList;
                int iOooOOo14 = OooOOO0.OooOOo(bArr, i, oooOO0O);
                o00o0o02.addInt(CodedInputStream.decodeZigZag32(oooOO0O.f28163OooO00o));
                while (iOooOOo14 < i2) {
                    int iOooOOo15 = OooOOO0.OooOOo(bArr, iOooOOo14, oooOO0O);
                    if (i3 != oooOO0O.f28163OooO00o) {
                        return iOooOOo14;
                    }
                    iOooOOo14 = OooOOO0.OooOOo(bArr, iOooOOo15, oooOO0O);
                    o00o0o02.addInt(CodedInputStream.decodeZigZag32(oooOO0O.f28163OooO00o));
                }
                return iOooOOo14;
            case 34:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                if (i5 == 2) {
                    return OooOOO0.OooOOO0(bArr, i, protobufList, oooOO0O);
                }
                if (i5 != 0) {
                    return i;
                }
                oo0O oo0o4 = (oo0O) protobufList;
                int iOooOo003 = OooOOO0.OooOo00(bArr, i, oooOO0O);
                oo0o4.addLong(CodedInputStream.decodeZigZag64(oooOO0O.f28164OooO0O0));
                while (iOooOo003 < i2) {
                    int iOooOOo16 = OooOOO0.OooOOo(bArr, iOooOo003, oooOO0O);
                    if (i3 != oooOO0O.f28163OooO00o) {
                        return iOooOo003;
                    }
                    iOooOo003 = OooOOO0.OooOo00(bArr, iOooOOo16, oooOO0O);
                    oo0o4.addLong(CodedInputStream.decodeZigZag64(oooOO0O.f28164OooO0O0));
                }
                return iOooOo003;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                if (i5 == 3) {
                    o0oO0O0o o0oo0o0oOooOOO0 = OooOOO0(i6);
                    int i22 = (i3 & (-8)) | 4;
                    int iOooO0Oo = OooOOO0.OooO0Oo(o0oo0o0oOooOOO0, bArr, i, i2, i22, oooOO0O);
                    o0oO0O0o o0oo0o0o = o0oo0o0oOooOOO0;
                    byte[] bArr2 = bArr;
                    protobufList.add(oooOO0O.f28165OooO0OO);
                    while (iOooO0Oo < i2) {
                        int iOooOOo17 = OooOOO0.OooOOo(bArr2, iOooO0Oo, oooOO0O);
                        if (i3 != oooOO0O.f28163OooO00o) {
                            return iOooO0Oo;
                        }
                        byte[] bArr3 = bArr2;
                        o0oO0O0o o0oo0o0o2 = o0oo0o0o;
                        iOooO0Oo = OooOOO0.OooO0Oo(o0oo0o0o2, bArr3, iOooOOo17, i2, i22, oooOO0O);
                        protobufList.add(oooOO0O.f28165OooO0OO);
                        o0oo0o0o = o0oo0o0o2;
                        bArr2 = bArr3;
                    }
                    return iOooO0Oo;
                }
            default:
                return i;
        }
        return i8;
    }

    public final void Oooo00o(Object obj, long j, o000OOo o000ooo2, o0oO0O0o o0oo0o0o, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int tag;
        List listOooO0OO = this.f28420OooOOO0.OooO0OO(obj, j);
        if (WireFormat.getTagWireType(o000ooo2.f28220OooO0O0) != 3) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int i = o000ooo2.f28220OooO0O0;
        do {
            Object objNewInstance = o0oo0o0o.newInstance();
            o000ooo2.OooO0O0(objNewInstance, o0oo0o0o, extensionRegistryLite);
            o0oo0o0o.makeImmutable(objNewInstance);
            listOooO0OO.add(objNewInstance);
            CodedInputStream codedInputStream = o000ooo2.f28219OooO00o;
            if (codedInputStream.isAtEnd() || o000ooo2.f28222OooO0Oo != 0) {
                return;
            } else {
                tag = codedInputStream.readTag();
            }
        } while (tag == i);
        o000ooo2.f28222OooO0Oo = tag;
    }

    public final void Oooo0O0(int i, o000OOo o000ooo2, Object obj) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((536870912 & i) != 0) {
            o000ooo2.OooOo(2);
            o0OO.OooOOoo(obj, i & 1048575, o000ooo2.f28219OooO00o.readStringRequireUtf8());
        } else if (!this.f28415OooO0oO) {
            o0OO.OooOOoo(obj, i & 1048575, o000ooo2.OooO0o0());
        } else {
            o000ooo2.OooOo(2);
            o0OO.OooOOoo(obj, i & 1048575, o000ooo2.f28219OooO00o.readString());
        }
    }

    public final void Oooo0OO(int i, o000OOo o000ooo2, Object obj) throws IOException {
        boolean z = (536870912 & i) != 0;
        o00OO0O0 o00oo0o0 = this.f28420OooOOO0;
        if (z) {
            o000ooo2.OooOo00(o00oo0o0.OooO0OO(obj, i & 1048575), true);
        } else {
            o000ooo2.OooOo00(o00oo0o0.OooO0OO(obj, i & 1048575), false);
        }
    }

    public final void Oooo0o(Object obj, int i) {
        int i2 = this.f28409OooO00o[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        o0OO.OooOOo0(obj, j, (1 << (i2 >>> 20)) | o0OO.f28347OooO0OO.OooOO0(obj, j));
    }

    public final void Oooo0oO(Object obj, int i, int i2) {
        o0OO.OooOOo0(obj, this.f28409OooO00o[i2 + 2] & 1048575, i);
    }

    public final int Oooo0oo(int i, int i2) {
        int[] iArr = this.f28409OooO00o;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OoooO(com.google.protobuf.MessageLite r22, com.google.protobuf.oO0000O r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.o0oOOo.OoooO(com.google.protobuf.MessageLite, com.google.protobuf.oO0000O):void");
    }

    public final void OoooO00(Object obj, int i, int i2, Object obj2) {
        f28406OooOOo.putObject(obj, OoooO0O(i2) & 1048575, obj2);
        Oooo0oO(obj, i, i2);
    }

    public final int OoooO0O(int i) {
        return this.f28409OooO00o[i + 1];
    }

    public final void OoooOO0(oO0000O oo0000o, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            Object objOooOO0o = OooOO0o(i2);
            this.f28422OooOOOo.getClass();
            o0o0Oo metadata = ((MapEntryLite) objOooOO0o).getMetadata();
            MapFieldLite mapFieldLite = (MapFieldLite) obj;
            o0000oo o0000ooVar = (o0000oo) oo0000o;
            CodedOutputStream codedOutputStream = o0000ooVar.f28210OooO00o;
            if (!codedOutputStream.isSerializationDeterministic()) {
                Iterator it = mapFieldLite.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    codedOutputStream.writeTag(i, 2);
                    codedOutputStream.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, entry.getKey(), entry.getValue()));
                    MapEntryLite.writeTo(codedOutputStream, metadata, entry.getKey(), entry.getValue());
                }
                return;
            }
            int i3 = 0;
            switch (o0000O00.f28204OooO00o[metadata.f28400OooO00o.ordinal()]) {
                case 1:
                    Boolean bool = Boolean.FALSE;
                    V v = mapFieldLite.get(bool);
                    CodedOutputStream codedOutputStream2 = o0000ooVar.f28210OooO00o;
                    if (v != 0) {
                        codedOutputStream2.writeTag(i, 2);
                        codedOutputStream2.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, bool, v));
                        MapEntryLite.writeTo(codedOutputStream2, metadata, bool, v);
                    }
                    Boolean bool2 = Boolean.TRUE;
                    V v2 = mapFieldLite.get(bool2);
                    if (v2 != 0) {
                        codedOutputStream2.writeTag(i, 2);
                        codedOutputStream2.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, bool2, v2));
                        MapEntryLite.writeTo(codedOutputStream2, metadata, bool2, v2);
                        return;
                    }
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    int size = mapFieldLite.size();
                    int[] iArr = new int[size];
                    Iterator it2 = mapFieldLite.keySet().iterator();
                    int i4 = 0;
                    while (it2.hasNext()) {
                        iArr[i4] = ((Integer) it2.next()).intValue();
                        i4++;
                    }
                    Arrays.sort(iArr);
                    while (i3 < size) {
                        int i5 = iArr[i3];
                        V v3 = mapFieldLite.get(Integer.valueOf(i5));
                        codedOutputStream.writeTag(i, 2);
                        codedOutputStream.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, Integer.valueOf(i5), v3));
                        MapEntryLite.writeTo(codedOutputStream, metadata, Integer.valueOf(i5), v3);
                        i3++;
                    }
                    return;
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    int size2 = mapFieldLite.size();
                    long[] jArr = new long[size2];
                    Iterator it3 = mapFieldLite.keySet().iterator();
                    int i6 = 0;
                    while (it3.hasNext()) {
                        jArr[i6] = ((Long) it3.next()).longValue();
                        i6++;
                    }
                    Arrays.sort(jArr);
                    while (i3 < size2) {
                        long j = jArr[i3];
                        V v4 = mapFieldLite.get(Long.valueOf(j));
                        codedOutputStream.writeTag(i, 2);
                        codedOutputStream.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, Long.valueOf(j), v4));
                        MapEntryLite.writeTo(codedOutputStream, metadata, Long.valueOf(j), v4);
                        i3++;
                    }
                    return;
                case 12:
                    int size3 = mapFieldLite.size();
                    String[] strArr = new String[size3];
                    Iterator it4 = mapFieldLite.keySet().iterator();
                    int i7 = 0;
                    while (it4.hasNext()) {
                        strArr[i7] = (String) it4.next();
                        i7++;
                    }
                    Arrays.sort(strArr);
                    while (i3 < size3) {
                        String str = strArr[i3];
                        V v5 = mapFieldLite.get(str);
                        codedOutputStream.writeTag(i, 2);
                        codedOutputStream.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, str, v5));
                        MapEntryLite.writeTo(codedOutputStream, metadata, str, v5);
                        i3++;
                    }
                    return;
                default:
                    throw new IllegalArgumentException("does not support key type: " + metadata.f28400OooO00o);
            }
        }
    }

    @Override // com.google.protobuf.o0oO0O0o
    public final boolean isInitialized(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        loop0: while (true) {
            if (i6 >= this.f28417OooOO0) {
                if (this.f28413OooO0o) {
                    ((o000O0) this.f28421OooOOOO).getClass();
                    if (!((GeneratedMessageLite.ExtendableMessage) obj).extensions.OooOO0()) {
                        break;
                    }
                }
                return true;
            }
            int i7 = this.f28408OooO[i6];
            int[] iArr = this.f28409OooO00o;
            int i8 = iArr[i7];
            int iOoooO0O = OoooO0O(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = f28406OooOOo.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i5;
                i = i10;
            } else {
                int i12 = i5;
                i = i4;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & iOoooO0O) != 0 && !OooOOOo(obj, i2, i, i3, i11)) {
                break;
            }
            int iOoooO0 = OoooO0(iOoooO0O);
            if (iOoooO0 == 9 || iOoooO0 == 17) {
                if (OooOOOo(obj, i2, i, i3, i11)) {
                    if (!OooOOO0(i2).isInitialized(o0OO.f28347OooO0OO.OooOOO0(obj, iOoooO0O & 1048575))) {
                        break;
                    }
                } else {
                    continue;
                }
                i6++;
                i4 = i;
                i5 = i3;
            } else {
                if (iOoooO0 != 27) {
                    if (iOoooO0 == 60 || iOoooO0 == 68) {
                        if (OooOOo(obj, i8, i2)) {
                            if (!OooOOO0(i2).isInitialized(o0OO.f28347OooO0OO.OooOOO0(obj, iOoooO0O & 1048575))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                        i6++;
                        i4 = i;
                        i5 = i3;
                    } else if (iOoooO0 != 49) {
                        if (iOoooO0 != 50) {
                            continue;
                        } else {
                            Object objOooOOO0 = o0OO.f28347OooO0OO.OooOOO0(obj, iOoooO0O & 1048575);
                            this.f28422OooOOOo.getClass();
                            MapFieldLite mapFieldLite = (MapFieldLite) objOooOOO0;
                            if (!mapFieldLite.isEmpty() && ((MapEntryLite) OooOO0o(i2)).getMetadata().f28402OooO0OO.getJavaType() == WireFormat.JavaType.MESSAGE) {
                                o0oO0O0o o0oo0o0oOooO00o = null;
                                for (Object obj2 : mapFieldLite.values()) {
                                    if (o0oo0o0oOooO00o == null) {
                                        o0oo0o0oOooO00o = o0O00O.f28290OooO0OO.OooO00o(obj2.getClass());
                                    }
                                    if (!o0oo0o0oOooO00o.isInitialized(obj2)) {
                                        break loop0;
                                    }
                                }
                            }
                        }
                        i6++;
                        i4 = i;
                        i5 = i3;
                    }
                }
                List list = (List) o0OO.f28347OooO0OO.OooOOO0(obj, iOoooO0O & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    o0oO0O0o o0oo0o0oOooOOO0 = OooOOO0(i2);
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        if (!o0oo0o0oOooOOO0.isInitialized(list.get(i13))) {
                            break loop0;
                        }
                    }
                }
                i6++;
                i4 = i;
                i5 = i3;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    @Override // com.google.protobuf.o0oO0O0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void makeImmutable(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = OooOOo0(r9)
            if (r0 != 0) goto L8
            goto La5
        L8:
            boolean r0 = r9 instanceof com.google.protobuf.GeneratedMessageLite
            if (r0 == 0) goto L18
            r0 = r9
            com.google.protobuf.GeneratedMessageLite r0 = (com.google.protobuf.GeneratedMessageLite) r0
            r0.clearMemoizedSerializedSize()
            r0.clearMemoizedHashCode()
            r0.markImmutable()
        L18:
            int[] r0 = r8.f28409OooO00o
            int r1 = r0.length
            r2 = 0
        L1c:
            if (r2 >= r1) goto L84
            int r3 = r8.OoooO0O(r2)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r4 = (long) r4
            int r3 = OoooO0(r3)
            r6 = 9
            if (r3 == r6) goto L6e
            r6 = 60
            if (r3 == r6) goto L58
            r6 = 68
            if (r3 == r6) goto L58
            switch(r3) {
                case 17: goto L6e;
                case 18: goto L52;
                case 19: goto L52;
                case 20: goto L52;
                case 21: goto L52;
                case 22: goto L52;
                case 23: goto L52;
                case 24: goto L52;
                case 25: goto L52;
                case 26: goto L52;
                case 27: goto L52;
                case 28: goto L52;
                case 29: goto L52;
                case 30: goto L52;
                case 31: goto L52;
                case 32: goto L52;
                case 33: goto L52;
                case 34: goto L52;
                case 35: goto L52;
                case 36: goto L52;
                case 37: goto L52;
                case 38: goto L52;
                case 39: goto L52;
                case 40: goto L52;
                case 41: goto L52;
                case 42: goto L52;
                case 43: goto L52;
                case 44: goto L52;
                case 45: goto L52;
                case 46: goto L52;
                case 47: goto L52;
                case 48: goto L52;
                case 49: goto L52;
                case 50: goto L3b;
                default: goto L3a;
            }
        L3a:
            goto L81
        L3b:
            sun.misc.Unsafe r3 = com.google.protobuf.o0oOOo.f28406OooOOo
            java.lang.Object r6 = r3.getObject(r9, r4)
            if (r6 == 0) goto L81
            com.google.protobuf.o00OOOO0 r7 = r8.f28422OooOOOo
            r7.getClass()
            r7 = r6
            com.google.protobuf.MapFieldLite r7 = (com.google.protobuf.MapFieldLite) r7
            r7.makeImmutable()
            r3.putObject(r9, r4, r6)
            goto L81
        L52:
            com.google.protobuf.o00OO0O0 r3 = r8.f28420OooOOO0
            r3.OooO00o(r9, r4)
            goto L81
        L58:
            r3 = r0[r2]
            boolean r3 = r8.OooOOo(r9, r3, r2)
            if (r3 == 0) goto L81
            com.google.protobuf.o0oO0O0o r3 = r8.OooOOO0(r2)
            sun.misc.Unsafe r6 = com.google.protobuf.o0oOOo.f28406OooOOo
            java.lang.Object r4 = r6.getObject(r9, r4)
            r3.makeImmutable(r4)
            goto L81
        L6e:
            boolean r3 = r8.OooOOOO(r9, r2)
            if (r3 == 0) goto L81
            com.google.protobuf.o0oO0O0o r3 = r8.OooOOO0(r2)
            sun.misc.Unsafe r6 = com.google.protobuf.o0oOOo.f28406OooOOo
            java.lang.Object r4 = r6.getObject(r9, r4)
            r3.makeImmutable(r4)
        L81:
            int r2 = r2 + 3
            goto L1c
        L84:
            com.google.protobuf.o0OO00o0 r0 = r8.f28419OooOOO
            com.google.protobuf.o0OO0 r0 = (com.google.protobuf.o0OO0) r0
            r0.getClass()
            r0 = r9
            com.google.protobuf.GeneratedMessageLite r0 = (com.google.protobuf.GeneratedMessageLite) r0
            com.google.protobuf.UnknownFieldSetLite r0 = r0.unknownFields
            r0.makeImmutable()
            boolean r0 = r8.f28413OooO0o
            if (r0 == 0) goto La5
            com.google.protobuf.o000O00 r0 = r8.f28421OooOOOO
            com.google.protobuf.o000O0 r0 = (com.google.protobuf.o000O0) r0
            r0.getClass()
            com.google.protobuf.GeneratedMessageLite$ExtendableMessage r9 = (com.google.protobuf.GeneratedMessageLite.ExtendableMessage) r9
            com.google.protobuf.o00O000 r9 = r9.extensions
            r9.OooOOO0()
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.o0oOOo.makeImmutable(java.lang.Object):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.google.protobuf.o0oO0O0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mergeFrom(java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.o0oOOo.mergeFrom(java.lang.Object, java.lang.Object):void");
    }

    @Override // com.google.protobuf.o0oO0O0o
    public final Object newInstance() {
        this.OooOO0o.getClass();
        return ((GeneratedMessageLite) this.f28414OooO0o0).newMutableInstance();
    }
}
