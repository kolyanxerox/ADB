package com.applovin.shadow.okhttp3;

import Oooo0oO.o00000;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.http.DatesKt;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.o0O0O00;
import o00O0.o00O0O;
import o00O0.oo000o;
import o00O0OoO.OooO0OO;
import o00O0oO.o000000;
import o00O0oO.o0000O00;
import oo00o.OooOO0;

/* loaded from: classes.dex */
public final class Headers implements Iterable<OooOO0>, OooO0OO {
    public static final Companion Companion = new Companion(null);
    private final String[] namesAndValues;

    public static final class Builder {
        private final List<String> namesAndValues = new ArrayList(20);

        public final Builder add(String line) {
            OooOo.OooO0o0(line, "line");
            int iOoooO0 = o000000.OoooO0(line, ':', 0, 6);
            if (iOoooO0 == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(line).toString());
            }
            String strSubstring = line.substring(0, iOoooO0);
            OooOo.OooO0Oo(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String string = o000000.OoooooO(strSubstring).toString();
            String strSubstring2 = line.substring(iOoooO0 + 1);
            OooOo.OooO0Oo(strSubstring2, "this as java.lang.String).substring(startIndex)");
            add(string, strSubstring2);
            return this;
        }

        public final Builder addAll(Headers headers) {
            OooOo.OooO0o0(headers, "headers");
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                addLenient$okhttp(headers.name(i), headers.value(i));
            }
            return this;
        }

        public final Builder addLenient$okhttp(String line) {
            OooOo.OooO0o0(line, "line");
            int iOoooO0 = o000000.OoooO0(line, ':', 1, 4);
            if (iOoooO0 != -1) {
                String strSubstring = line.substring(0, iOoooO0);
                OooOo.OooO0Oo(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iOoooO0 + 1);
                OooOo.OooO0Oo(strSubstring2, "this as java.lang.String).substring(startIndex)");
                addLenient$okhttp(strSubstring, strSubstring2);
                return this;
            }
            if (line.charAt(0) != ':') {
                addLenient$okhttp("", line);
                return this;
            }
            String strSubstring3 = line.substring(1);
            OooOo.OooO0Oo(strSubstring3, "this as java.lang.String).substring(startIndex)");
            addLenient$okhttp("", strSubstring3);
            return this;
        }

        public final Builder addUnsafeNonAscii(String name, String value) {
            OooOo.OooO0o0(name, "name");
            OooOo.OooO0o0(value, "value");
            Headers.Companion.checkName(name);
            addLenient$okhttp(name, value);
            return this;
        }

        public final Headers build() {
            return new Headers((String[]) this.namesAndValues.toArray(new String[0]), null);
        }

        public final String get(String name) {
            OooOo.OooO0o0(name, "name");
            int size = this.namesAndValues.size() - 2;
            int iOooO0oO = o00000.OooO0oO(size, 0, -2);
            if (iOooO0oO > size) {
                return null;
            }
            while (!name.equalsIgnoreCase(this.namesAndValues.get(size))) {
                if (size == iOooO0oO) {
                    return null;
                }
                size -= 2;
            }
            return this.namesAndValues.get(size + 1);
        }

        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        public final Builder removeAll(String name) {
            OooOo.OooO0o0(name, "name");
            int i = 0;
            while (i < this.namesAndValues.size()) {
                if (name.equalsIgnoreCase(this.namesAndValues.get(i))) {
                    this.namesAndValues.remove(i);
                    this.namesAndValues.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public final Builder set(String name, Date value) {
            OooOo.OooO0o0(name, "name");
            OooOo.OooO0o0(value, "value");
            set(name, DatesKt.toHttpDateString(value));
            return this;
        }

        public final Builder set(String name, Instant value) {
            OooOo.OooO0o0(name, "name");
            OooOo.OooO0o0(value, "value");
            return set(name, new Date(value.toEpochMilli()));
        }

        public final Builder set(String name, String value) {
            OooOo.OooO0o0(name, "name");
            OooOo.OooO0o0(value, "value");
            Companion companion = Headers.Companion;
            companion.checkName(name);
            companion.checkValue(value, name);
            removeAll(name);
            addLenient$okhttp(name, value);
            return this;
        }

        public final Builder add(String name, String value) {
            OooOo.OooO0o0(name, "name");
            OooOo.OooO0o0(value, "value");
            Companion companion = Headers.Companion;
            companion.checkName(name);
            companion.checkValue(value, name);
            addLenient$okhttp(name, value);
            return this;
        }

        public final Builder add(String name, Date value) {
            OooOo.OooO0o0(name, "name");
            OooOo.OooO0o0(value, "value");
            add(name, DatesKt.toHttpDateString(value));
            return this;
        }

        public final Builder addLenient$okhttp(String name, String value) {
            OooOo.OooO0o0(name, "name");
            OooOo.OooO0o0(value, "value");
            this.namesAndValues.add(name);
            this.namesAndValues.add(o000000.OoooooO(value).toString());
            return this;
        }

        public final Builder add(String name, Instant value) {
            OooOo.OooO0o0(name, "name");
            OooOo.OooO0o0(value, "value");
            add(name, new Date(value.toEpochMilli()));
            return this;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkName(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkValue(String str, String str2) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Util.format("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), str2));
                    sb.append(Util.isSensitiveHeader(str2) ? "" : ": ".concat(str));
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String get(String[] strArr, String str) {
            int length = strArr.length - 2;
            int iOooO0oO = o00000.OooO0oO(length, 0, -2);
            if (iOooO0oO > length) {
                return null;
            }
            while (!o0000O00.Oooo000(str, strArr[length])) {
                if (length == iOooO0oO) {
                    return null;
                }
                length -= 2;
            }
            return strArr[length + 1];
        }

        /* renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m13591deprecated_of(String... namesAndValues) {
            OooOo.OooO0o0(namesAndValues, "namesAndValues");
            return m3959of((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        /* renamed from: of */
        public final Headers m3959of(String... namesAndValues) {
            OooOo.OooO0o0(namesAndValues, "namesAndValues");
            if (namesAndValues.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr = (String[]) namesAndValues.clone();
            int length = strArr.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                String str = strArr[i2];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr[i2] = o000000.OoooooO(str).toString();
            }
            int iOooO0oO = o00000.OooO0oO(0, strArr.length - 1, 2);
            if (iOooO0oO >= 0) {
                while (true) {
                    String str2 = strArr[i];
                    String str3 = strArr[i + 1];
                    checkName(str2);
                    checkValue(str3, str2);
                    if (i == iOooO0oO) {
                        break;
                    }
                    i += 2;
                }
            }
            return new Headers(strArr, null);
        }

        private Companion() {
        }

        /* renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m13590deprecated_of(Map<String, String> headers) {
            OooOo.OooO0o0(headers, "headers");
            return m3958of(headers);
        }

        /* renamed from: of */
        public final Headers m3958of(Map<String, String> map) {
            OooOo.OooO0o0(map, "<this>");
            String[] strArr = new String[map.size() * 2];
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String string = o000000.OoooooO(key).toString();
                String string2 = o000000.OoooooO(value).toString();
                checkName(string);
                checkValue(string2, string);
                strArr[i] = string;
                strArr[i + 1] = string2;
                i += 2;
            }
            return new Headers(strArr, null);
        }
    }

    public /* synthetic */ Headers(String[] strArr, OooOO0O oooOO0O) {
        this(strArr);
    }

    /* renamed from: of */
    public static final Headers m3956of(Map<String, String> map) {
        return Companion.m3958of(map);
    }

    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m13589deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        for (int i = 0; i < strArr.length; i++) {
            length += this.namesAndValues[i].length();
        }
        return length;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) obj).namesAndValues);
    }

    public final String get(String name) {
        OooOo.OooO0o0(name, "name");
        return Companion.get(this.namesAndValues, name);
    }

    public final Date getDate(String name) {
        OooOo.OooO0o0(name, "name");
        String str = get(name);
        if (str != null) {
            return DatesKt.toHttpDateOrNull(str);
        }
        return null;
    }

    public final Instant getInstant(String name) {
        OooOo.OooO0o0(name, "name");
        Date date = getDate(name);
        if (date != null) {
            return date.toInstant();
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @Override // java.lang.Iterable
    public Iterator<OooOO0> iterator() {
        int size = size();
        OooOO0[] oooOO0Arr = new OooOO0[size];
        for (int i = 0; i < size; i++) {
            oooOO0Arr[i] = new OooOO0(name(i), value(i));
        }
        return o0O0O00.OooO0Oo(oooOO0Arr);
    }

    public final String name(int i) {
        return this.namesAndValues[i * 2];
    }

    public final Set<String> names() {
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        OooOo.OooO0Oo(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        TreeSet treeSet = new TreeSet(CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i = 0; i < size; i++) {
            treeSet.add(name(i));
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        OooOo.OooO0Oo(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        o00O0O.OooOo(builder.getNamesAndValues$okhttp(), this.namesAndValues);
        return builder;
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    public final Map<String, List<String>> toMultimap() {
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        OooOo.OooO0Oo(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        TreeMap treeMap = new TreeMap(CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i = 0; i < size; i++) {
            String strName = name(i);
            Locale US = Locale.US;
            OooOo.OooO0Oo(US, "US");
            String lowerCase = strName.toLowerCase(US);
            OooOo.OooO0Oo(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(value(i));
        }
        return treeMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strName = name(i);
            String strValue = value(i);
            sb.append(strName);
            sb.append(": ");
            if (Util.isSensitiveHeader(strName)) {
                strValue = "██";
            }
            sb.append(strValue);
            sb.append("\n");
        }
        String string = sb.toString();
        OooOo.OooO0Oo(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String value(int i) {
        return this.namesAndValues[(i * 2) + 1];
    }

    public final List<String> values(String name) {
        OooOo.OooO0o0(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (name.equalsIgnoreCase(name(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i));
            }
        }
        if (arrayList == null) {
            return oo000o.f31251OooOo0O;
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        OooOo.OooO0Oo(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    /* renamed from: of */
    public static final Headers m3957of(String... strArr) {
        return Companion.m3959of(strArr);
    }
}
