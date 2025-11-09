package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import com.ironsource.C3034d9;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes2.dex */
public abstract class oO0OOO00 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final Pattern f22685OooO00o = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final Pattern f22686OooO0O0 = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final Map f22687OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final Map f22688OooO0Oo;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f22687OooO0OO = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f22688OooO0Oo = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.SpannedString OooO00o(java.lang.String r19, java.lang.String r20, java.util.List r21) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oO0OOO00.OooO00o(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static int OooO0O0(List list, String str, oOOoOOO0 ooooooo0) {
        ArrayList arrayListOooO0Oo = OooO0Oo(list, str, ooooooo0);
        for (int i = 0; i < arrayListOooO0Oo.size(); i++) {
            int i2 = ((oO00o000) arrayListOooO0Oo.get(i)).f22535OooOo0o.f22501OooOOOO;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    public static oO00OOo0 OooO0OO(String str, Matcher matcher, r40 r40Var, ArrayList arrayList) {
        oO00o00 oo00o00 = new oO00o00();
        try {
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                throw null;
            }
            oo00o00.f22524OooO00o = ze0.OooOo0O(strGroup);
            String strGroup2 = matcher.group(2);
            if (strGroup2 == null) {
                throw null;
            }
            oo00o00.f22525OooO0O0 = ze0.OooOo0O(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            OooO0o(strGroup3, oo00o00);
            StringBuilder sb = new StringBuilder();
            String strOooo00o = r40Var.Oooo00o(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strOooo00o)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strOooo00o.trim());
                strOooo00o = r40Var.Oooo00o(StandardCharsets.UTF_8);
            }
            oo00o00.f22526OooO0OO = OooO00o(str, sb.toString(), arrayList);
            return new oO00OOo0(oo00o00.OooO00o().OooO00o(), oo00o00.f22524OooO00o, oo00o00.f22525OooO0O0);
        } catch (NumberFormatException unused) {
            AbstractC1641hg.OooOOo0("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList OooO0Oo(java.util.List r8, java.lang.String r9, com.google.android.gms.internal.ads.oOOoOOO0 r10) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            int r3 = r8.size()
            if (r2 >= r3) goto L7a
            java.lang.Object r3 = r8.get(r2)
            com.google.android.gms.internal.ads.oO00OOOo r3 = (com.google.android.gms.internal.ads.oO00OOOo) r3
            java.lang.String r4 = r10.f22857OooO00o
            java.lang.String r5 = r3.f22489OooO00o
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3f
            java.lang.String r5 = r3.f22490OooO0O0
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3f
            java.util.Set r5 = r3.f22491OooO0OO
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3f
            java.lang.String r5 = r3.f22492OooO0Oo
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3f
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L3d
            r4 = 1
            goto L6d
        L3d:
            r4 = r1
            goto L6d
        L3f:
            java.lang.String r5 = r3.f22489OooO00o
            r6 = 1073741824(0x40000000, float:2.0)
            int r5 = com.google.android.gms.internal.ads.oO00OOOo.OooO00o(r1, r6, r5, r9)
            java.lang.String r6 = r3.f22490OooO0O0
            r7 = 2
            int r4 = com.google.android.gms.internal.ads.oO00OOOo.OooO00o(r5, r7, r6, r4)
            java.lang.String r5 = r3.f22492OooO0Oo
            java.lang.String r6 = r10.f22859OooO0OO
            r7 = 4
            int r4 = com.google.android.gms.internal.ads.oO00OOOo.OooO00o(r4, r7, r5, r6)
            r5 = -1
            if (r4 == r5) goto L3d
            java.util.Set r5 = r3.f22491OooO0OO
            java.util.Set r6 = r10.f22860OooO0Oo
            boolean r5 = r6.containsAll(r5)
            if (r5 != 0) goto L65
            goto L3d
        L65:
            java.util.Set r5 = r3.f22491OooO0OO
            int r5 = r5.size()
            int r5 = r5 * r7
            int r4 = r4 + r5
        L6d:
            if (r4 <= 0) goto L77
            com.google.android.gms.internal.ads.oO00o000 r5 = new com.google.android.gms.internal.ads.oO00o000
            r5.<init>(r4, r3)
            r0.add(r5)
        L77:
            int r2 = r2 + 1
            goto L7
        L7a:
            java.util.Collections.sort(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oO0OOO00.OooO0Oo(java.util.List, java.lang.String, com.google.android.gms.internal.ads.oOOoOOO0):java.util.ArrayList");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void OooO0o(String str, oO00o00 oo00o00) {
        Matcher matcher = f22686OooO0O0.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i2 = 2;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                char c = 65535;
                if (Constants.LINE.equals(strGroup)) {
                    int iIndexOf = strGroup2.indexOf(44);
                    if (iIndexOf != -1) {
                        String strSubstring = strGroup2.substring(iIndexOf + 1);
                        switch (strSubstring.hashCode()) {
                            case -1364013995:
                                if (strSubstring.equals("center")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (strSubstring.equals("middle")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case 100571:
                                if (strSubstring.equals("end")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (strSubstring.equals("start")) {
                                    c = 0;
                                    break;
                                }
                                break;
                        }
                        if (c == 0) {
                            i2 = 0;
                        } else if (c == 1 || c == 2) {
                            i2 = 1;
                        } else if (c != 3) {
                            AbstractC1641hg.OooOOo0("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                            i2 = Integer.MIN_VALUE;
                        }
                        oo00o00.f22530OooO0oO = i2;
                        strGroup2 = strGroup2.substring(0, iIndexOf);
                    }
                    if (strGroup2.endsWith("%")) {
                        oo00o00.f22529OooO0o0 = ze0.OooO0O0(strGroup2);
                        oo00o00.f22528OooO0o = 0;
                    } else {
                        oo00o00.f22529OooO0o0 = Integer.parseInt(strGroup2);
                        oo00o00.f22528OooO0o = 1;
                    }
                } else if ("align".equals(strGroup)) {
                    switch (strGroup2.hashCode()) {
                        case -1364013995:
                            if (strGroup2.equals("center")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -1074341483:
                            if (strGroup2.equals("middle")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 100571:
                            if (strGroup2.equals("end")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 3317767:
                            if (strGroup2.equals("left")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 108511772:
                            if (strGroup2.equals("right")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 109757538:
                            if (strGroup2.equals("start")) {
                                c = 0;
                                break;
                            }
                            break;
                    }
                    if (c != 0) {
                        if (c == 1) {
                            i = 4;
                        } else if (c == 2 || c == 3) {
                            i = 2;
                        } else if (c == 4) {
                            i = 3;
                        } else if (c != 5) {
                            AbstractC1641hg.OooOOo0("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                            i = 2;
                        } else {
                            i = 5;
                        }
                    }
                    oo00o00.f22527OooO0Oo = i;
                } else if (C3034d9.h.f8078L.equals(strGroup)) {
                    int iIndexOf2 = strGroup2.indexOf(44);
                    if (iIndexOf2 != -1) {
                        String strSubstring2 = strGroup2.substring(iIndexOf2 + 1);
                        switch (strSubstring2.hashCode()) {
                            case -1842484672:
                                if (strSubstring2.equals("line-left")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case -1364013995:
                                if (strSubstring2.equals("center")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case -1276788989:
                                if (strSubstring2.equals("line-right")) {
                                    c = 4;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (strSubstring2.equals("middle")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 100571:
                                if (strSubstring2.equals("end")) {
                                    c = 5;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (strSubstring2.equals("start")) {
                                    c = 1;
                                    break;
                                }
                                break;
                        }
                        if (c == 0 || c == 1) {
                            i = 0;
                        } else if (c != 2 && c != 3) {
                            if (c == 4 || c == 5) {
                                i = 2;
                            } else {
                                AbstractC1641hg.OooOOo0("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring2));
                                i = Integer.MIN_VALUE;
                            }
                        }
                        oo00o00.f22523OooO = i;
                        strGroup2 = strGroup2.substring(0, iIndexOf2);
                    }
                    oo00o00.f22531OooO0oo = ze0.OooO0O0(strGroup2);
                } else if ("size".equals(strGroup)) {
                    oo00o00.f22532OooOO0 = ze0.OooO0O0(strGroup2);
                } else if ("vertical".equals(strGroup)) {
                    int iHashCode = strGroup2.hashCode();
                    if (iHashCode != 3462) {
                        if (iHashCode == 3642 && strGroup2.equals("rl")) {
                            c = 0;
                        }
                    } else if (strGroup2.equals("lr")) {
                        c = 1;
                    }
                    if (c != 0) {
                        if (c != 1) {
                            AbstractC1641hg.OooOOo0("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i = Integer.MIN_VALUE;
                        } else {
                            i = 2;
                        }
                    }
                    oo00o00.f22533OooOO0O = i;
                } else {
                    AbstractC1641hg.OooOOo0("WebvttCueParser", "Unknown cue setting " + strGroup + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + strGroup2);
                }
            } catch (NumberFormatException unused) {
                AbstractC1641hg.OooOOo0("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0087  */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void OooO0o0(java.lang.String r19, com.google.android.gms.internal.ads.oOOoOOO0 r20, java.util.List r21, android.text.SpannableStringBuilder r22, java.util.List r23) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oO0OOO00.OooO0o0(java.lang.String, com.google.android.gms.internal.ads.oOOoOOO0, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }
}
