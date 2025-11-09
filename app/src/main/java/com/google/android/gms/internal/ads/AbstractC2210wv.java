package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.ironsource.C3034d9;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.utils.StringUtils;

/* renamed from: com.google.android.gms.internal.ads.wv */
/* loaded from: classes2.dex */
public abstract class AbstractC2210wv {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final Pattern f25411OooO00o = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final Pattern f25412OooO0O0 = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final Pattern f25413OooO0OO = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final HashMap f25414OooO0Oo;

    static {
        HashMap map = new HashMap();
        f25414OooO0Oo = map;
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-984833, map, "aliceblue", -332841, "antiquewhite");
        map.put("aqua", -16711681);
        map.put("aquamarine", -8388652);
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-983041, map, "azure", -657956, "beige");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-6972, map, "bisque", ViewCompat.MEASURED_STATE_MASK, "black");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-5171, map, "blanchedalmond", -16776961, "blue");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-7722014, map, "blueviolet", -5952982, "brown");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-2180985, map, "burlywood", -10510688, "cadetblue");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-8388864, map, "chartreuse", -2987746, "chocolate");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-32944, map, "coral", -10185235, "cornflowerblue");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-1828, map, "cornsilk", -2354116, "crimson");
        map.put("cyan", -16711681);
        map.put("darkblue", -16777077);
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        map.put("darkgray", -5658199);
        map.put("darkgreen", -16751616);
        map.put("darkgrey", -5658199);
        map.put("darkkhaki", -4343957);
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-29696, map, "darkorange", -6737204, "darkorchid");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-7667712, map, "darkred", -1468806, "darksalmon");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        map.put("darkturquoise", -16724271);
        map.put("darkviolet", -7077677);
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        map.put("dodgerblue", -14774017);
        map.put("firebrick", -5103070);
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-1296, map, "floralwhite", -14513374, "forestgreen");
        map.put("fuchsia", -65281);
        map.put("gainsboro", -2302756);
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-16744448, map, "green", -5374161, "greenyellow");
        map.put("grey", -8355712);
        map.put("honeydew", -983056);
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-38476, map, "hotpink", -3318692, "indianred");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-11861886, map, "indigo", -16, "ivory");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-989556, map, "khaki", -1644806, "lavender");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-3851, map, "lavenderblush", -8586240, "lawngreen");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-1331, map, "lemonchiffon", -5383962, "lightblue");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-18751, map, "lightpink", -24454, "lightsalmon");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        map.put("lightsteelblue", -5192482);
        map.put("lightyellow", -32);
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-15132304, map, "midnightblue", -655366, "mintcream");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-6943, map, "mistyrose", -6987, "moccasin");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-8531, map, "navajowhite", -16777088, "navy");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-133658, map, "oldlace", -8355840, "olive");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-9728477, map, "olivedrab", -23296, "orange");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-47872, map, "orangered", -2461482, "orchid");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-4139, map, "papayawhip", -9543, "peachpuff");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-3308225, map, "peru", -16181, "pink");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-2252579, map, "plum", -5185306, "powderblue");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-8388480, map, "purple", -10079335, "rebeccapurple");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(SupportMenu.CATEGORY_MASK, map, "red", -4419697, "rosybrown");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-12490271, map, "royalblue", -7650029, "saddlebrown");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-360334, map, "salmon", -744352, "sandybrown");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-13726889, map, "seagreen", -2578, "seashell");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-6270419, map, "sienna", -4144960, "silver");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        map.put("snow", -1286);
        map.put("springgreen", -16711809);
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-12156236, map, "steelblue", -2968436, "tan");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-16744320, map, "teal", -2572328, "thistle");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-40121, map, "tomato", 0, C3034d9.h.f8087T);
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-12525360, map, "turquoise", -1146130, "violet");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-663885, map, "wheat", -1, "white");
        androidx.datastore.preferences.protobuf.OooO00o.OooOo0(-657931, map, "whitesmoke", InputDeviceCompat.SOURCE_ANY, "yellow");
        map.put("yellowgreen", -6632142);
    }

    public static int OooO00o(String str, boolean z) throws NumberFormatException {
        int i;
        af0.OoooO0(!TextUtils.isEmpty(str));
        String strReplace = str.replace(StringUtils.SPACE, "");
        if (strReplace.charAt(0) == '#') {
            int i2 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i2;
            }
            if (strReplace.length() == 9) {
                return ((i2 & 255) << 24) | (i2 >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z ? f25413OooO0OO : f25412OooO0O0).matcher(strReplace);
            if (matcher.matches()) {
                if (z) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    i = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    String strGroup2 = matcher.group(4);
                    strGroup2.getClass();
                    i = Integer.parseInt(strGroup2, 10);
                }
                String strGroup3 = matcher.group(1);
                strGroup3.getClass();
                int i3 = Integer.parseInt(strGroup3, 10);
                String strGroup4 = matcher.group(2);
                strGroup4.getClass();
                int i4 = Integer.parseInt(strGroup4, 10);
                String strGroup5 = matcher.group(3);
                strGroup5.getClass();
                return Color.argb(i, i3, i4, Integer.parseInt(strGroup5, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = f25411OooO00o.matcher(strReplace);
            if (matcher2.matches()) {
                String strGroup6 = matcher2.group(1);
                strGroup6.getClass();
                int i5 = Integer.parseInt(strGroup6, 10);
                String strGroup7 = matcher2.group(2);
                strGroup7.getClass();
                int i6 = Integer.parseInt(strGroup7, 10);
                String strGroup8 = matcher2.group(3);
                strGroup8.getClass();
                return Color.rgb(i5, i6, Integer.parseInt(strGroup8, 10));
            }
        } else {
            Integer num = (Integer) f25414OooO0Oo.get(xh0.OooOOo0(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
