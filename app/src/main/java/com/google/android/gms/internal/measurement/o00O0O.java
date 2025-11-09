package com.google.android.gms.internal.measurement;

import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.internal.ads.C2051sk;
import io.flutter.embedding.android.KeyboardMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class o00O0O implements Iterable, Oooo0 {

    /* renamed from: OooOo0O */
    public final String f26532OooOo0O;

    public o00O0O(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f26532OooOo0O = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final Oooo0 OooO0Oo(String str, C2051sk c2051sk, ArrayList arrayList) {
        String str2;
        String str3;
        String str4;
        String str5;
        char c;
        int i;
        int i2;
        int i3;
        int i4;
        C2051sk c2051sk2;
        int iOooOo0;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || AppLovinEventTypes.USER_EXECUTED_SEARCH.equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "hasOwnProperty";
            str3 = "trim";
        } else {
            str2 = "hasOwnProperty";
            str3 = "trim";
            if (!str3.equals(str)) {
                throw new IllegalArgumentException(str.concat(" is not a String function"));
            }
        }
        switch (str.hashCode()) {
            case -1789698943:
                str4 = str2;
                str5 = "charAt";
                if (str.equals(str4)) {
                    c = 2;
                    break;
                } else {
                    c = 65535;
                    break;
                }
            case -1776922004:
                str5 = "charAt";
                if (str.equals("toString")) {
                    c = 14;
                    str4 = str2;
                    break;
                }
                str4 = str2;
                c = 65535;
                break;
            case -1464939364:
                str5 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    c = '\f';
                    str4 = str2;
                    break;
                }
                str4 = str2;
                c = 65535;
                break;
            case -1361633751:
                str5 = "charAt";
                if (str.equals(str5)) {
                    str4 = str2;
                    c = 0;
                    break;
                }
                str4 = str2;
                c = 65535;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str4 = str2;
                    str5 = "charAt";
                    c = 1;
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c = 65535;
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    c = '\r';
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c = 65535;
                break;
            case -906336856:
                if (str.equals(AppLovinEventTypes.USER_EXECUTED_SEARCH)) {
                    c = 7;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c = 65535;
                break;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    c = 11;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c = 65535;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c = 4;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c = 65535;
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    c = 15;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c = 65535;
                break;
            case 3568674:
                if (str.equals(str3)) {
                    c = 16;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c = 65535;
                break;
            case 103668165:
                if (str.equals("match")) {
                    c = 5;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c = '\b';
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c = 65535;
                break;
            case 109648666:
                if (str.equals("split")) {
                    c = '\t';
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c = 65535;
                break;
            case 530542161:
                if (str.equals("substring")) {
                    c = '\n';
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c = 65535;
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    c = 6;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    str4 = str2;
                    str5 = "charAt";
                    c = 3;
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c = 65535;
                break;
            default:
                str4 = str2;
                str5 = "charAt";
                c = 65535;
                break;
        }
        String strZzc = AdError.UNDEFINED_DOMAIN;
        char c2 = c;
        String str6 = this.f26532OooOo0O;
        switch (c2) {
            case 0:
                o00O0.o000OOo.OooOOOo(1, str5, arrayList);
                int iOooOo02 = !arrayList.isEmpty() ? (int) o00O0.o000OOo.OooOo0(((oo000o) c2051sk.f24096OooOo).OooO0OO(c2051sk, (Oooo0) arrayList.get(0)).zzd().doubleValue()) : 0;
                return (iOooOo02 < 0 || iOooOo02 >= str6.length()) ? Oooo0.f26436OooOOoo : new o00O0O(String.valueOf(str6.charAt(iOooOo02)));
            case 1:
                if (!arrayList.isEmpty()) {
                    StringBuilder sb = new StringBuilder(str6);
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        sb.append(((oo000o) c2051sk.f24096OooOo).OooO0OO(c2051sk, (Oooo0) arrayList.get(i5)).zzc());
                    }
                    return new o00O0O(sb.toString());
                }
                return this;
            case 2:
                o00O0.o000OOo.OooOOO0(str4, arrayList, 1);
                Oooo0 oooo0OooO0OO = ((oo000o) c2051sk.f24096OooOo).OooO0OO(c2051sk, (Oooo0) arrayList.get(0));
                boolean zEquals = "length".equals(oooo0OooO0OO.zzc());
                OooO oooO = Oooo0.f26435OooOOo0;
                if (zEquals) {
                    return oooO;
                }
                double dDoubleValue = oooo0OooO0OO.zzd().doubleValue();
                return (dDoubleValue != Math.floor(dDoubleValue) || (i = (int) dDoubleValue) < 0 || i >= str6.length()) ? Oooo0.f26434OooOOo : oooO;
            case 3:
                o00O0.o000OOo.OooOOOo(2, "indexOf", arrayList);
                if (arrayList.size() > 0) {
                    strZzc = ((oo000o) c2051sk.f24096OooOo).OooO0OO(c2051sk, (Oooo0) arrayList.get(0)).zzc();
                }
                return new OooOO0O(Double.valueOf(str6.indexOf(strZzc, (int) o00O0.o000OOo.OooOo0(arrayList.size() < 2 ? 0.0d : ((oo000o) c2051sk.f24096OooOo).OooO0OO(c2051sk, (Oooo0) arrayList.get(1)).zzd().doubleValue()))));
            case 4:
                o00O0.o000OOo.OooOOOo(2, "lastIndexOf", arrayList);
                if (arrayList.size() > 0) {
                    strZzc = ((oo000o) c2051sk.f24096OooOo).OooO0OO(c2051sk, (Oooo0) arrayList.get(0)).zzc();
                }
                String str7 = strZzc;
                return new OooOO0O(Double.valueOf(str6.lastIndexOf(str7, (int) (Double.isNaN(arrayList.size() < 2 ? Double.NaN : ((oo000o) c2051sk.f24096OooOo).OooO0OO(c2051sk, (Oooo0) arrayList.get(1)).zzd().doubleValue()) ? Double.POSITIVE_INFINITY : o00O0.o000OOo.OooOo0(r3)))));
            case 5:
                o00O0.o000OOo.OooOOOo(1, "match", arrayList);
                Matcher matcher = Pattern.compile(arrayList.size() <= 0 ? "" : ((oo000o) c2051sk.f24096OooOo).OooO0OO(c2051sk, (Oooo0) arrayList.get(0)).zzc()).matcher(str6);
                return matcher.find() ? new OooO0o(Arrays.asList(new o00O0O(matcher.group()))) : Oooo0.f26431OooOOO0;
            case 6:
                o00O0.o000OOo.OooOOOo(2, "replace", arrayList);
                Oooo0 oooo0OooO00o = Oooo0.OooOO0o;
                if (!arrayList.isEmpty()) {
                    strZzc = ((oo000o) c2051sk.f24096OooOo).OooO0OO(c2051sk, (Oooo0) arrayList.get(0)).zzc();
                    if (arrayList.size() > 1) {
                        oooo0OooO00o = ((oo000o) c2051sk.f24096OooOo).OooO0OO(c2051sk, (Oooo0) arrayList.get(1));
                    }
                }
                String str8 = strZzc;
                int iIndexOf = str6.indexOf(str8);
                if (iIndexOf >= 0) {
                    if (oooo0OooO00o instanceof OooOOO0) {
                        i2 = 0;
                        oooo0OooO00o = ((OooOOO0) oooo0OooO00o).OooO00o(c2051sk, Arrays.asList(new o00O0O(str8), new OooOO0O(Double.valueOf(iIndexOf)), this));
                    } else {
                        i2 = 0;
                    }
                    String strSubstring = str6.substring(i2, iIndexOf);
                    String strZzc2 = oooo0OooO00o.zzc();
                    String strSubstring2 = str6.substring(str8.length() + iIndexOf);
                    return new o00O0O(androidx.datastore.preferences.protobuf.OooO00o.OooOOO0(new StringBuilder(String.valueOf(strSubstring).length() + String.valueOf(strZzc2).length() + String.valueOf(strSubstring2).length()), strSubstring, strZzc2, strSubstring2));
                }
                return this;
            case 7:
                o00O0.o000OOo.OooOOOo(1, AppLovinEventTypes.USER_EXECUTED_SEARCH, arrayList);
                if (!arrayList.isEmpty()) {
                    strZzc = ((oo000o) c2051sk.f24096OooOo).OooO0OO(c2051sk, (Oooo0) arrayList.get(0)).zzc();
                }
                return Pattern.compile(strZzc).matcher(str6).find() ? new OooOO0O(Double.valueOf(r1.start())) : new OooOO0O(Double.valueOf(-1.0d));
            case '\b':
                o00O0.o000OOo.OooOOOo(2, "slice", arrayList);
                double dOooOo0 = o00O0.o000OOo.OooOo0(!arrayList.isEmpty() ? ((oo000o) c2051sk.f24096OooOo).OooO0OO(c2051sk, (Oooo0) arrayList.get(0)).zzd().doubleValue() : 0.0d);
                double dMax = dOooOo0 < 0.0d ? Math.max(str6.length() + dOooOo0, 0.0d) : Math.min(dOooOo0, str6.length());
                double dOooOo02 = o00O0.o000OOo.OooOo0(arrayList.size() > 1 ? ((oo000o) c2051sk.f24096OooOo).OooO0OO(c2051sk, (Oooo0) arrayList.get(1)).zzd().doubleValue() : str6.length());
                int i6 = (int) dMax;
                return new o00O0O(str6.substring(i6, Math.max(0, ((int) (dOooOo02 < 0.0d ? Math.max(str6.length() + dOooOo02, 0.0d) : Math.min(dOooOo02, str6.length()))) - i6) + i6));
            case '\t':
                o00O0.o000OOo.OooOOOo(2, "split", arrayList);
                if (str6.length() == 0) {
                    return new OooO0o(Arrays.asList(this));
                }
                ArrayList arrayList2 = new ArrayList();
                if (arrayList.isEmpty()) {
                    arrayList2.add(this);
                } else {
                    String strZzc3 = ((oo000o) c2051sk.f24096OooOo).OooO0OO(c2051sk, (Oooo0) arrayList.get(0)).zzc();
                    long jOooOo00 = arrayList.size() > 1 ? o00O0.o000OOo.OooOo00(((oo000o) c2051sk.f24096OooOo).OooO0OO(c2051sk, (Oooo0) arrayList.get(1)).zzd().doubleValue()) & KeyboardMap.kValueMask : 2147483647L;
                    if (jOooOo00 == 0) {
                        return new OooO0o();
                    }
                    String[] strArrSplit = str6.split(Pattern.quote(strZzc3), ((int) jOooOo00) + 1);
                    int length = strArrSplit.length;
                    if (!strZzc3.isEmpty() || length <= 0) {
                        i3 = length;
                        i4 = 0;
                    } else {
                        boolean zIsEmpty = strArrSplit[0].isEmpty();
                        i3 = length - 1;
                        i4 = zIsEmpty;
                        if (!strArrSplit[i3].isEmpty()) {
                            i3 = length;
                            i4 = zIsEmpty;
                        }
                    }
                    if (length > jOooOo00) {
                        i3--;
                    }
                    while (i4 < i3) {
                        arrayList2.add(new o00O0O(strArrSplit[i4]));
                        i4++;
                    }
                }
                return new OooO0o(arrayList2);
            case '\n':
                o00O0.o000OOo.OooOOOo(2, "substring", arrayList);
                if (arrayList.isEmpty()) {
                    c2051sk2 = c2051sk;
                    iOooOo0 = 0;
                } else {
                    c2051sk2 = c2051sk;
                    iOooOo0 = (int) o00O0.o000OOo.OooOo0(((oo000o) c2051sk2.f24096OooOo).OooO0OO(c2051sk2, (Oooo0) arrayList.get(0)).zzd().doubleValue());
                }
                int iOooOo03 = arrayList.size() > 1 ? (int) o00O0.o000OOo.OooOo0(((oo000o) c2051sk2.f24096OooOo).OooO0OO(c2051sk2, (Oooo0) arrayList.get(1)).zzd().doubleValue()) : str6.length();
                int iMin = Math.min(Math.max(iOooOo0, 0), str6.length());
                int iMin2 = Math.min(Math.max(iOooOo03, 0), str6.length());
                return new o00O0O(str6.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
            case 11:
                o00O0.o000OOo.OooOOO0("toLocaleUpperCase", arrayList, 0);
                return new o00O0O(str6.toUpperCase());
            case '\f':
                o00O0.o000OOo.OooOOO0("toLocaleLowerCase", arrayList, 0);
                return new o00O0O(str6.toLowerCase());
            case '\r':
                o00O0.o000OOo.OooOOO0("toLowerCase", arrayList, 0);
                return new o00O0O(str6.toLowerCase(Locale.ENGLISH));
            case 14:
                o00O0.o000OOo.OooOOO0("toString", arrayList, 0);
                return this;
            case 15:
                o00O0.o000OOo.OooOOO0("toUpperCase", arrayList, 0);
                return new o00O0O(str6.toUpperCase(Locale.ENGLISH));
            case 16:
                o00O0.o000OOo.OooOOO0("toUpperCase", arrayList, 0);
                return new o00O0O(str6.trim());
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o00O0O) {
            return this.f26532OooOo0O.equals(((o00O0O) obj).f26532OooOo0O);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26532OooOo0O.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new o0OoOo0(this, 1);
    }

    public final String toString() {
        String str = this.f26532OooOo0O;
        return androidx.datastore.preferences.protobuf.OooO00o.OooOOO0(new StringBuilder(str.length() + 2), "\"", str, "\"");
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final String zzc() {
        return this.f26532OooOo0O;
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final Double zzd() {
        String str = this.f26532OooOo0O;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final Boolean zze() {
        return Boolean.valueOf(!this.f26532OooOo0O.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final Iterator zzf() {
        return new o0OoOo0(this);
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final Oooo0 zzt() {
        return new o00O0O(this.f26532OooOo0O);
    }
}
