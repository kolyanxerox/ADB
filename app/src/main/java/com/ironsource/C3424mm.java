package com.ironsource;

import com.google.android.gms.internal.measurement.o0OO0O0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ironsource.mm */
/* loaded from: classes2.dex */
public final class C3424mm {

    /* renamed from: a */
    private final String f10306a;

    /* renamed from: b */
    private final int f10307b;

    public C3424mm(String str, int i) {
        this.f10306a = str;
        this.f10307b = i;
    }

    /* renamed from: b */
    private final String m10864b() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        kotlin.jvm.internal.OooOo.OooO0Oo(stackTrace, "stackTrace");
        return String.format("%s %s", Arrays.copyOf(new Object[]{m10863a(stackTrace, 4), m10865b(stackTrace, 4)}, 2));
    }

    /* renamed from: a */
    public final int m10866a() {
        return this.f10307b;
    }

    /* renamed from: c */
    public final String m10867c() {
        String str = this.f10306a;
        if (str == null || str.length() == 0) {
            return m10864b();
        }
        return m10864b() + " - " + this.f10306a;
    }

    /* renamed from: a */
    private final String m10863a(StackTraceElement[] stackTraceElementArr, int i) {
        List listOooOO0o;
        List listOooo0O0;
        List listOooOO0o2;
        if (stackTraceElementArr.length <= i) {
            return "";
        }
        String className = stackTraceElementArr[i].getClassName();
        kotlin.jvm.internal.OooOo.OooO0Oo(className, "stackTrace[depth]\n              .className");
        Pattern patternCompile = Pattern.compile("\\.");
        kotlin.jvm.internal.OooOo.OooO0Oo(patternCompile, "compile(...)");
        Matcher matcher = patternCompile.matcher(className);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList.add(className.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add(className.subSequence(iEnd, className.length()).toString());
            listOooOO0o = arrayList;
        } else {
            listOooOO0o = o0OO0O0.OooOO0o(className.toString());
        }
        boolean zIsEmpty = listOooOO0o.isEmpty();
        List listOooo0O02 = o00O0.oo000o.f31251OooOo0O;
        if (zIsEmpty) {
            listOooo0O0 = listOooo0O02;
        } else {
            ListIterator listIterator = listOooOO0o.listIterator(listOooOO0o.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    listOooo0O0 = o00O0.OooOo00.Oooo0O0(listIterator.nextIndex() + 1, listOooOO0o);
                    break;
                }
            }
            listOooo0O0 = listOooo0O02;
        }
        String str = ((String[]) listOooo0O0.toArray(new String[0]))[r7.length - 1];
        if (!o00O0oO.o000000.Oooo0o("$", str)) {
            return str;
        }
        Pattern patternCompile2 = Pattern.compile("\\$");
        kotlin.jvm.internal.OooOo.OooO0Oo(patternCompile2, "compile(...)");
        Matcher matcher2 = patternCompile2.matcher(str);
        if (matcher2.find()) {
            ArrayList arrayList2 = new ArrayList(10);
            int iEnd2 = 0;
            do {
                arrayList2.add(str.subSequence(iEnd2, matcher2.start()).toString());
                iEnd2 = matcher2.end();
            } while (matcher2.find());
            arrayList2.add(str.subSequence(iEnd2, str.length()).toString());
            listOooOO0o2 = arrayList2;
        } else {
            listOooOO0o2 = o0OO0O0.OooOO0o(str.toString());
        }
        if (!listOooOO0o2.isEmpty()) {
            ListIterator listIterator2 = listOooOO0o2.listIterator(listOooOO0o2.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    break;
                }
                if (((String) listIterator2.previous()).length() != 0) {
                    listOooo0O02 = o00O0.OooOo00.Oooo0O0(listIterator2.nextIndex() + 1, listOooOO0o2);
                    break;
                }
            }
        }
        return ((String[]) listOooo0O02.toArray(new String[0]))[0];
    }

    /* renamed from: b */
    private final String m10865b(StackTraceElement[] stackTraceElementArr, int i) {
        List listOooOO0o;
        List listOooo0O0;
        int i2;
        List listOooOO0o2;
        List listOooOO0o3;
        if (stackTraceElementArr.length <= i) {
            return "";
        }
        String className = stackTraceElementArr[i].getClassName();
        kotlin.jvm.internal.OooOo.OooO0Oo(className, "stackTrace[depth]\n              .className");
        Pattern patternCompile = Pattern.compile("\\.");
        kotlin.jvm.internal.OooOo.OooO0Oo(patternCompile, "compile(...)");
        Matcher matcher = patternCompile.matcher(className);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList.add(className.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add(className.subSequence(iEnd, className.length()).toString());
            listOooOO0o = arrayList;
        } else {
            listOooOO0o = o0OO0O0.OooOO0o(className.toString());
        }
        boolean zIsEmpty = listOooOO0o.isEmpty();
        List listOooo0O02 = o00O0.oo000o.f31251OooOo0O;
        if (zIsEmpty) {
            listOooo0O0 = listOooo0O02;
        } else {
            ListIterator listIterator = listOooOO0o.listIterator(listOooOO0o.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    listOooo0O0 = o00O0.OooOo00.Oooo0O0(listIterator.nextIndex() + 1, listOooOO0o);
                    break;
                }
            }
            listOooo0O0 = listOooo0O02;
        }
        String[] strArr = (String[]) listOooo0O0.toArray(new String[0]);
        String str = strArr[strArr.length - 1];
        if (o00O0oO.o000000.Oooo0o("$", str)) {
            Pattern patternCompile2 = Pattern.compile("\\$");
            kotlin.jvm.internal.OooOo.OooO0Oo(patternCompile2, "compile(...)");
            Matcher matcher2 = patternCompile2.matcher(str);
            if (matcher2.find()) {
                ArrayList arrayList2 = new ArrayList(10);
                int iEnd2 = 0;
                do {
                    arrayList2.add(str.subSequence(iEnd2, matcher2.start()).toString());
                    iEnd2 = matcher2.end();
                } while (matcher2.find());
                arrayList2.add(str.subSequence(iEnd2, str.length()).toString());
                listOooOO0o3 = arrayList2;
            } else {
                listOooOO0o3 = o0OO0O0.OooOO0o(str.toString());
            }
            if (!listOooOO0o3.isEmpty()) {
                ListIterator listIterator2 = listOooOO0o3.listIterator(listOooOO0o3.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        break;
                    }
                    if (((String) listIterator2.previous()).length() != 0) {
                        listOooo0O02 = o00O0.OooOo00.Oooo0O0(listIterator2.nextIndex() + 1, listOooOO0o3);
                        break;
                    }
                }
            }
            return ((String[]) listOooo0O02.toArray(new String[0]))[1] + '.' + stackTraceElementArr[i].getMethodName();
        }
        String methodName = stackTraceElementArr[i].getMethodName();
        kotlin.jvm.internal.OooOo.OooO0Oo(methodName, "stackTrace[depth].methodName");
        if (!o00O0oO.o000000.Oooo0o("$", methodName) || stackTraceElementArr.length <= (i2 = i + 1)) {
            String methodName2 = stackTraceElementArr[i].getMethodName();
            kotlin.jvm.internal.OooOo.OooO0Oo(methodName2, "stackTrace[depth].methodName");
            return methodName2;
        }
        String className2 = stackTraceElementArr[i2].getClassName();
        kotlin.jvm.internal.OooOo.OooO0Oo(className2, "stackTrace[depth + 1]\n                .className");
        Pattern patternCompile3 = Pattern.compile("\\$");
        kotlin.jvm.internal.OooOo.OooO0Oo(patternCompile3, "compile(...)");
        Matcher matcher3 = patternCompile3.matcher(className2);
        if (matcher3.find()) {
            ArrayList arrayList3 = new ArrayList(10);
            int iEnd3 = 0;
            do {
                arrayList3.add(className2.subSequence(iEnd3, matcher3.start()).toString());
                iEnd3 = matcher3.end();
            } while (matcher3.find());
            arrayList3.add(className2.subSequence(iEnd3, className2.length()).toString());
            listOooOO0o2 = arrayList3;
        } else {
            listOooOO0o2 = o0OO0O0.OooOO0o(className2.toString());
        }
        if (!listOooOO0o2.isEmpty()) {
            ListIterator listIterator3 = listOooOO0o2.listIterator(listOooOO0o2.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                if (((String) listIterator3.previous()).length() != 0) {
                    listOooo0O02 = o00O0.OooOo00.Oooo0O0(listIterator3.nextIndex() + 1, listOooOO0o2);
                    break;
                }
            }
        }
        String[] strArr2 = (String[]) listOooo0O02.toArray(new String[0]);
        if (strArr2.length <= 1) {
            String methodName3 = stackTraceElementArr[i2].getMethodName();
            kotlin.jvm.internal.OooOo.OooO0Oo(methodName3, "{\n              stackTra….methodName\n            }");
            return methodName3;
        }
        return strArr2[1] + '.' + stackTraceElementArr[i2].getMethodName();
    }
}
