package com.ironsource.adqualitysdk.sdk.p009i;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.ChartboostDelegate;
import com.chartboost.sdk.InPlay.CBInPlay;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.a;
import com.chartboost.sdk.g;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.bk */
/* loaded from: classes2.dex */
public final class C2680bk extends AbstractC2676bg {

    /* renamed from: ﻛ */
    private static int f5194 = 0;

    /* renamed from: ﾇ */
    private static int f5196 = 1;

    /* renamed from: ｋ */
    private static char[] f5195 = {'C', 48608, 31601, 14570, 63060, 46026, 29023, 11991, 60467, 43452, 26385, 9403, 57876, 40833, 23814, 6801, 55540, 38513, 45370, 3225, 51720, 35219, 18221, 691, 49190, 40878, 23882, 6341, 9619, 38938, 24201, 7462, 54176, 38420, 21633, 2833, 39499, 10178, 57685, 41717, 27724, 10697, 60249, 46276, 30241, 13231, 64822, 63166, 19230, 36231, 52738, 178, 17711, 34730, 55332, 6877, 24438, 37324, 53839, 5366, 26999, 20652, 60674, 11145, 26627, 42685, 58162, 8617, 32291, 48339, 63859, 14272, 29761, 45802, 53092, 3562, 19055, 34839, 50819, 796, 16804, 40509, 56508, 6445, 22439, 37977, 53956, 28493, 3317, 45436, 30703, 13379, 64230, 49004, 32227, 8829, 57477, 42263, 27529, 10240, 61082, 37691, 20897, 5679, 54357, 39623, 24423, 7629, 49762, 33015, 17776, 3047, 51202, 36487, 'c', 48615, 31613, 14518, 63043, 46016, 29009, 11978, 60468, 43434, 26431, 9399, 57875, 40860, 23902, 6795, 55524, 38499, 21438, 4468, 52933, 35919, 18897, 1883, 50361, 33382, 16275, 64794, 47785, 30725, 13696, 62218, 45413, 28411, 11363, 59889, 42831, 25798, 8817, 57307, 40244, 23201, 6182, 54705, 37652, 20625, 38484, 11259, 60793, 44768, 24655, 9670, 59225, 47308, 31273, 16316, 61740, 45737, 21516, 59827, 12089, 27815, 41484, 59282, 9483, 31362, 10622, 38081, 21067, 4565, 57214, 39648, 22649, 2032, 50479, 32901, 19984, 3480, 52014, 46757, 29759, 13247, 35022, 13639, 62420, 45176, 32477, 15191, 63960, 42566, 25790, 8492, 61362, 44091, 27323, 5900, 54680, 37378, 20556, 7910, 56169, 39420, 18011, 1228, 49481, 36812, 1652, 48126, 32119, 16072, 61531, 46554, 30545, 10463, 59953, 44980, 24876, 8888, 58375, 39359, 23302, 7303, 57078, 36988, 21986, 6015, 51414, 'g', 48621, 31588, 14555, 63048, 46025, 28994, 11980, 60450, 43431, 26431, 9387, 57876, 40894, 23880, 6823, 55476, 38487, 21408, 4444, 52933, 35908, 18901, 1887, 50337, 33340, 16309, 'c', 48634, 31605, 14585, 63060, 46029, 29028, 12026, 60419, 43424, 26417, 9386, 57876, 40842, 23839, 6807, 55539, 38524, 21460, 4477, 52940, 35917, 18903, 1881, 50356, 33325, 'i', 48635, 31559, 14589, 63042, 46078, 29017, 11997, 60471, 43405, 26430, 9401, 57858, 40836, 23829, 6812, 23829, 57503, 9750, 26027, 43810, 61098, 11276, 29611, 45407, 62687};

    /* renamed from: ﻐ */
    private static long f5193 = 6250170775138319752L;

    /* renamed from: ﾒ */
    private static long f5197 = 4025454710350715304L;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.bk$e */
    public class e extends ChartboostDelegate implements InterfaceC2838hg<ChartboostDelegate> {

        /* renamed from: ﺙ */
        private static int f5207 = 0;

        /* renamed from: ﻏ */
        private static int f5208 = 1;

        /* renamed from: ﻛ */
        private static long f5209;

        /* renamed from: ﾇ */
        private static char[] f5210;

        /* renamed from: ｋ */
        private InterfaceC2704ch f5212;

        /* renamed from: ﾒ */
        private ChartboostDelegate f5213;

        static {
            char[] cArr = new char[1261];
            ByteBuffer.wrap("\u0012¸ý\u009cÌ\u0084ß¤®³¹Ò\u0088Î\u009býjðu\bD)W;&#1]\u0000N\u0013{â\u007fÍaÝÛ¬\u0095¿¿\u008e¯\u0099ÄhÎ{÷JÞU\u0018$\u001f7*\u0006-\u0011Jà^óRÂz\u00adq½\u0093\u008c\u0095\u009f£nµyÛH×[õ*ì5\u0012\u0000CïgÞ\u007fÍ_¼H«)\u009a5\u0089\u0006x\u000bgóVÒEÀ4Ø#¦\u0012µ\u0001\u0080ð\u0084ß\u009aÏ ¾n\u00adD\u009cT\u008b?z5i\fX3Gï6æ%Ô\u0014ß\u0003£ò¨á©Ð\u0081¿\u008a¯h\u009en\u008dX|Nk Z,I\u000e8\u0017'é`å\u008fÁ¾Ù\u00adùÜîË\u008fú\u0093é \u0018\u00ad\u0007U6t%fT~C\u0000r\u0013a&\u0090\"¿<¯\u0086ÞßÍãüùë¯\u001a\u009e\t\u00ad8¹'EVzEltac\u0001\u0092\u0005\u00815°=ß1ÏßþÓíì\u001cðø_\u0017{&c5CDTS5b)q\u001a\u0080\u0017\u009fï®Î½ÜÌÄÛºê©ù\u009c\b\u0098'\u00867<FeUYdCs\u0010\u0082$\u0091\u001d \u0007¿ÎÎæÝôìÀû¿\n©\u0019µ(\u009dG\u0096WtfruD\u0084R\u0093<¢0±\u0012À\u000bßõ\u0000CïgÞ\u007fÍ_¼H«)\u009a5\u0089\u0006x\u000bgóVÒEÀ4Ø#¦\u0012µ\u0001\u0080ð\u0084ß\u009aÏ ¾y\u00adE\u009c_\u008b\u000ez0i\u001bX\u001aGï6æ%×\u0014ú\u0003¬ò¥á\u0085Ð\u009d¿\u008d¯y\u009eu\u008d_|Sk(Z4\u0000CïgÞ\u007fÍ_¼H«)\u009a5\u0089\u0006x\u000bgóVÒEÀ4Ø#¦\u0012µ\u0001\u0080ð\u0084ß\u009aÏ ¾y\u00adE\u009c_\u008b\tz5i\u0007X\u0004Gã6Ü%Ê\u0014Ç\u0003§ò£á\u0093Ð\u009b¿\u0097¯y\u009eu\u008dJ|V\u0000CïgÞ\u007fÍ_¼H«)\u009a5\u0089\u0006x\u000bgóVÒEÀ4Ø#¦\u0012µ\u0001\u0080ð\u0084ß\u009aÏ ¾y\u00adE\u009c_\u008b\tz5i\u0001X\u0014Gí6Ü%Ê\u0014Ç\u0003§ò£á\u0093Ð\u009b¿\u0097¯y\u009eu\u008dJ|VìC\u0003g2\u007f!_PHG)v5e\u0006\u0094\u000b\u008bóºÒ©ÀØØÏ¦þµí\u0080\u001c\u00843\u009a# RyAEp_g\u000e\u00960\u0085\u001b´\u0007«êÚôÉÝøúï¬\u001e¥\r\u0085<\u009dS\u008dCyrua_\u0090S\u0087(¶4\u008f\u009a`¾Q¦B\u00863\u0091$ð\u0015ì\u0006ß÷Òè*Ù\u000bÊ\u0019»\u0001¬\u007f\u009dl\u008eY\u007f]PC@ù1 \"\u009c\u0013\u0086\u0004ÐõïæÜ×ÞÈ3¹)ª\t\u009b\u000f\u008cR}fnM_S0U §\u0011±\u0002\u009bó\u0097äùÕàÆÒ\u0000CïgÞ\u007fÍ_¼H«)\u009a5\u0089\u0006x\u000bgóVÒEÀ4Ø#¦\u0012µ\u0001\u0080ð\u0084ß\u009aÏ ¾n\u00adD\u009cT\u008b?z5i\fX%Gã6ä%Ñ\u0014Ö\u0003±ò¥á\u00adÐ\u0080¿\u008c¯h\u009e]\u008d[|Jk:°À_änü}Ü\fË\u001bª*¶9\u0085È\u0088×pæQõC\u0084[\u0093%¢6±\u0003@\u0007o\u0019\u007f£\u000eú\u001dÆ,Ü;\u008aÊ»Ù\u0088è\u009c÷`\u0086[\u0095H¤B³$B\u0013Q\u0013`\u001c\u000f\u000e9\u008aÖ®ç¶ô\u0096\u0085\u0081\u0092à£ü°ÏAÂ^:o\u001b|\t\r\u0011\u001ao+|8IÉMæSöé\u0087§\u0094\u008d¥\u009d²öCüPÅaú~&\u000f/\u001c\u001d-\u0016:jËaØdéI\u0086E\u0096¡§\u0094´\u0092E\u0083Ró\u0000CïgÞ\u007fÍ_¼H«)\u009a5\u0089\u0006x\u000bgóVÒEÀ4Ø#¦\u0012µ\u0001\u0080ð\u0084ß\u009aÏ ¾y\u00adE\u009c_\u008b\fz8i\u0001X\u001bGÒ6ú%è\u0014Ü\u0003£òµá\u00adÐ\u0080¿\u008c¯h\u009e]\u008d[|Jk:\u0088àgÄVÜEü4ë#\u008a\u0012\u0096\u0001¥ð¨ïPÞqÍc¼{«\u0005\u009a\u0016\u0089#x'W9G\u00836Ú%æ\u0014ü\u0003\u00adò\u0093á¸Ð¹ÏL¾E\u00adt\u009c]\u008b\u000ez\u0000i&X\r7-'Þ\u0016Ì\u0000CïgÞ\u007fÍ_¼H«)\u009a5\u0089\u0006x\u000bgóVÒEÀ4Ø#¦\u0012µ\u0001\u0080ð\u0084ß\u009aÏ ¾y\u00adE\u009c_\u008b\tz5i\u0007X\u0004Gã6Ø%Ë\u0014Á\u0003§ò\u0090á\u0090Ð\u009f¿\u008d\u0000CïgÞ\u007fÍ_¼H«)\u009a5\u0089\u0006x\u000bgóVÒEÀ4Ø#¦\u0012µ\u0001\u0080ð\u0084ß\u009aÏ ¾y\u00adE\u009c_\u008b\tz5i\u0001X\u0014Gí6Ø%Ë\u0014Á\u0003§ò\u0090á\u0090Ð\u009f¿\u008d\u0000CïgÞ\u007fÍ_¼H«)\u009a5\u0089\u0006x\u000bgóVÒEÀ4Ø#¦\u0012µ\u0001\u0080ð\u0084ß\u009aÏ ¾y\u00adE\u009c_\u008b\u000ez0i\u001bX\u0007Gê6ô%Ý\u0014þ\u0003\u00adò£á\u0085Ð®¿\u008e¯}\u009eo\u009e§q\u0083@\u009bS»\"¬5Í\u0004Ñ\u0017âæïù\u0017È6Û$ª<½B\u008cQ\u009fdn`A~QÄ \u009d3¡\u0002»\u0015èäÜ÷åÆÿÙ6¨\u001e»\u0012\u008a2\u009dElZ\u007fvNo!Y1\u0085\u0000\u0091\u0013¬âµ\u0000CïgÞ\u007fÍ_¼H«)\u009a5\u0089\u0006x\u000bgóVÒEÀ4Ø#¦\u0012µ\u0001\u0080ð\u0084ß\u009aÏ ¾y\u00adE\u009c_\u008b\u001az8i\u001dX\u0004Gã6Ö%È\u0014Ú\u0003¡òºá¦Ð\u0080¿\u008c¯N\u009es\u008dE|\\k Z*I\n8\u0017'ñ\u0016ý\u0005ÌôÜ\u0000dïfÞzÍ}¼]«>\u009a)\u0089\fx;gëVÿEÆ4ß#\u0085\u0012½\u0001\u0093ð³ß\u0090Ï`¾{\u00adE\u009cI\u008b'z8i\u001cX\u001eGé6ûU]ºy\u008ba\u0098AéVþ7Ï+Ü\u0018-\u00152í\u0003Ì\u0010ÞaÆv¸G«T\u009e¥\u009a\u008a\u0084\u009a>ëpøZÉJÞ!/+<\u0012\r-\u0012ñcøpÊAÁV½§¶´¬\u0085\u0094ê\u0097úrËpØQ)A>3\u000f\u0010\u001c\u0010m\frþCå\u0000CïgÞ\u007fÍ_¼H«)\u009a5\u0089\u0006x\u000bgóVÒEÀ4Ø#¦\u0012µ\u0001\u0080ð\u0084ß\u009aÏ ¾y\u00adE\u009c_\u008b\tz8i\u000bX\u001fGã6Ç%Á\u0014Ä\u0003£ò£á\u0084Ð\u008a¿\u009a¯[\u009eu\u008dO|_k&\u0000CïgÞ\u007fÍ_¼H«)\u009a5\u0089\u0006x\u000bgóVÒEÀ4Ø#¦\u0012µ\u0001\u0080ð\u0084ß\u009aÏ ¾y\u00adE\u009c_\u008b\fz8i\u0001X\u001bGÒ6ú%è\u0014Ü\u0003£òµá²Ð\u008a¿\u0089¯l\u009en\u008dO|_k-Z\u000eI\u000e8\u0012'à\u0016û\u0000CïgÞ\u007fÍ_¼H«)\u009a5\u0089\u0006x\u000bgóVÒEÀ4Ø#¦\u0012µ\u0001\u0080ð\u0084ß\u009aÏ ¾y\u00adE\u009c_\u008b\u000ez0i\u001bX\u001aGï6æ%×\u0014á\u0003§ò¦á\u0081Ð\u009d¿\u009a¯h\u009ex\u008d}|Sk-Z=I\bÒX=|\fd\u001fDnSy2H.[\u001dª\u0010µè\u0084É\u0097ÛæÃñ½À®Ó\u009b\"\u009f\r\u0081\u001d;lb\u007f^NDY\u0012¨.»\u001c\u008a\u001f\u0095øäÜ÷ÚÆßÑ¸ ¸3\u009f\u0002\u0091m\u0081}@Ln_T®D¹=\u0000CïgÞ\u007fÍ_¼H«)\u009a5\u0089\u0006x\u000bgóVÒEÀ4Ø#¦\u0012µ\u0001\u0080ð\u0084ß\u009aÏ ¾y\u00adE\u009c_\u008b\tz5i\u0001X\u0014Gí6Ç%Á\u0014Ä\u0003£ò£á\u0084Ð\u008a¿\u009a¯[\u009eu\u008dO|_k&\u0000CïgÞ\u007fÍ_¼H«)\u009a5\u0089\u0006x\u000bgóVÒEÀ4Ø#¦\u0012µ\u0001\u0080ð\u0084ß\u009aÏ ¾y\u00adE\u009c_\u008b\tz6i\u0005X\u0007Gê6ð%Ð\u0014Ö\u0003\u0090ò´á\u0097Ð\u008e¿\u008c¯i\u009ey\u008dO|lk Z<I\u00028\u0019\u0000CïgÞ\u007fÍ_¼H«)\u009a5\u0089\u0006x\u000bgóVÒEÀ4Ø#¦\u0012µ\u0001\u0080ð\u0084ß\u009aÏ ¾y\u00adE\u009c_\u008b\u000ez0i\u001bX\u0007Gê6ô%Ý\u0014á\u0003§ò¦á\u0081Ð\u009d¿\u009a¯h\u009ex\u008d}|Sk-Z=I\bìv\u0003R2J!jP}G\u001cv\u0000e3\u0094>\u008bÆºç©õØíÏ\u0093þ\u0080íµ\u001c±3¯#\u0015R_Appbg\u0013\u0096(\u00854´1«ÃÚÌÉðøÿï¡\u001e\u008d\r±<¿S¤\u0000CïgÞ\u007fÍ_¼H«)\u009a5\u0089\u0006x\u000bgóVÒEÀ4Ø#¦\u0012µ\u0001\u0080ð\u0084ß\u009aÏ ¾y\u00adE\u009c_\u008b\tz8i\u000bX\u001fGã6Ü%Ê\u0014ã\u0003®ò°á\u0099\u0000CïgÞ\u007fÍ_¼H«)\u009a5\u0089\u0006x\u000bgóVÒEÀ4Ø#¦\u0012µ\u0001\u0080ð\u0084ß\u009aÏ ¾y\u00adE\u009c_\u008b\fz8i\u0001X\u001bGÒ6ú%è\u0014Ü\u0003£òµá©Ð\u0081¿®¯a\u009e}\u008dR\t\ræ)×1Ä\u0011µ\u0006¢g\u0093{\u0080HqEn½_\u009cL\u008e=\u0096*è\u001bû\bÎùÊÖÔÆn·7¤\u000b\u0095\u0011\u0082Msy`OQMN¡?º,\u0086\u001d\u0094\nöûú".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1261);
            f5210 = cArr;
            f5209 = 2331273901551709967L;
        }

        public e(ChartboostDelegate chartboostDelegate, InterfaceC2704ch interfaceC2704ch) {
            this.f5213 = chartboostDelegate;
            this.f5212 = interfaceC2704ch;
        }

        /* renamed from: ｋ */
        private ChartboostDelegate m5583() {
            int i = f5208 + 123;
            f5207 = i % 128;
            if (i % 2 == 0) {
                return this.f5213;
            }
            throw null;
        }

        /* renamed from: ﾇ */
        private static String m5584(int i, int i2, char c) {
            String str;
            synchronized (C2642a.f4435) {
                try {
                    char[] cArr = new char[i];
                    C2642a.f4436 = 0;
                    while (true) {
                        int i3 = C2642a.f4436;
                        if (i3 < i) {
                            cArr[i3] = (char) ((f5210[i2 + i3] ^ (i3 * f5209)) ^ c);
                            C2642a.f4436 = i3 + 1;
                        } else {
                            str = new String(cArr);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str;
        }

        public void didCacheInPlay(String str) {
            f5207 = (f5208 + InterfaceC3173h3.d.b.f8821d) % 128;
            C2680bk.this.m5464(this, this.f5212, m5584(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 34, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1157, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f5213;
            if (chartboostDelegate != null) {
                int i = f5207 + 91;
                f5208 = i % 128;
                int i2 = i % 2;
                chartboostDelegate.didCacheInPlay(str);
                if (i2 == 0) {
                    throw null;
                }
            }
        }

        public void didCacheInterstitial(String str) {
            f5208 = (f5207 + 89) % 128;
            C2680bk.this.m5464(this, this.f5212, m5584(TextUtils.indexOf((CharSequence) "", '0', 0) + 40, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 88, (char) ((Process.myTid() >> 22) + 24742)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f5213;
            if (chartboostDelegate != null) {
                f5208 = (f5207 + 1) % 128;
                chartboostDelegate.didCacheInterstitial(str);
                f5208 = (f5207 + 95) % 128;
            }
        }

        public void didCacheMoreApps(String str) {
            f5207 = (f5208 + 91) % 128;
            C2680bk.this.m5464(this, this.f5212, m5584(Color.blue(0) + 35, KeyEvent.getDeadChar(0, 0) + 413, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 45187)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f5213;
            if (chartboostDelegate != null) {
                int i = f5208 + 21;
                f5207 = i % 128;
                int i2 = i % 2;
                chartboostDelegate.didCacheMoreApps(str);
                if (i2 != 0) {
                    int i3 = 36 / 0;
                }
                f5207 = (f5208 + 109) % 128;
            }
        }

        public void didCacheRewardedVideo(String str) {
            C2680bk.this.m5464(this, this.f5212, m5584(40 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 831 - Color.argb(0, 0, 0, 0), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f5213;
            if (chartboostDelegate != null) {
                f5207 = (f5208 + 117) % 128;
                chartboostDelegate.didCacheRewardedVideo(str);
                f5208 = (f5207 + 85) % 128;
            }
        }

        public void didClickInterstitial(String str) {
            f5207 = (f5208 + 33) % 128;
            C2680bk.this.m5464(this, this.f5212, m5584(TextUtils.indexOf((CharSequence) "", '0', 0) + 40, TextUtils.getOffsetAfter("", 0) + 251, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f5213;
            if (chartboostDelegate != null) {
                int i = f5208 + InterfaceC3173h3.d.b.f8819b;
                f5207 = i % 128;
                int i2 = i % 2;
                chartboostDelegate.didClickInterstitial(str);
                if (i2 != 0) {
                    throw null;
                }
            }
        }

        public void didClickMoreApps(String str) {
            f5207 = (f5208 + 31) % 128;
            C2680bk.this.m5464(this, this.f5212, m5584((ViewConfiguration.getPressedStateDuration() >> 16) + 35, 600 - KeyEvent.getDeadChar(0, 0), (char) TextUtils.getOffsetBefore("", 0)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f5213;
            if (chartboostDelegate != null) {
                f5208 = (f5207 + 113) % 128;
                chartboostDelegate.didClickMoreApps(str);
            }
            f5207 = (f5208 + 71) % 128;
        }

        public void didClickRewardedVideo(String str) {
            f5207 = (f5208 + 75) % 128;
            C2680bk.this.m5464(this, this.f5212, m5584(40 - Gravity.getAbsoluteGravity(0, 0), ExpandableListView.getPackedPositionType(0L) + DescriptorProtos.Edition.EDITION_PROTO2_VALUE, (char) Drawable.resolveOpacity(0, 0)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f5213;
            if (chartboostDelegate != null) {
                int i = f5207 + 3;
                f5208 = i % 128;
                int i2 = i % 2;
                chartboostDelegate.didClickRewardedVideo(str);
                if (i2 == 0) {
                    throw null;
                }
            }
            int i3 = f5207 + 7;
            f5208 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }

        public void didCloseInterstitial(String str) {
            f5207 = (f5208 + 67) % 128;
            C2680bk.this.m5464(this, this.f5212, m5584(38 - ExpandableListView.getPackedPositionChild(0L), MotionEvent.axisFromString("") + 213, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f5213;
            if (chartboostDelegate != null) {
                chartboostDelegate.didCloseInterstitial(str);
                f5207 = (f5208 + 19) % 128;
            }
        }

        public void didCloseMoreApps(String str) {
            f5207 = (f5208 + 53) % 128;
            C2680bk.this.m5464(this, this.f5212, m5584(35 - Drawable.resolveOpacity(0, 0), View.resolveSize(0, 0) + 565, (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0))).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f5213;
            if (chartboostDelegate != null) {
                chartboostDelegate.didCloseMoreApps(str);
                f5207 = (f5208 + 77) % 128;
            }
        }

        public void didCloseRewardedVideo(String str) {
            f5208 = (f5207 + 3) % 128;
            C2680bk.this.m5464(this, this.f5212, m5584(AndroidCharacter.getMirror('0') - '\b', 957 - MotionEvent.axisFromString(""), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 53787)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f5213;
            if (chartboostDelegate != null) {
                int i = f5208 + 81;
                f5207 = i % 128;
                int i2 = i % 2;
                chartboostDelegate.didCloseRewardedVideo(str);
                if (i2 != 0) {
                    throw null;
                }
            }
            f5208 = (f5207 + 91) % 128;
        }

        public void didCompleteInterstitial(String str) {
            f5208 = (f5207 + 63) % 128;
            C2680bk.this.m5464(this, this.f5212, m5584(42 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 331 - View.combineMeasuredStates(0, 0), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 36825)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f5213;
            if (chartboostDelegate != null) {
                chartboostDelegate.didCompleteInterstitial(str);
                f5208 = (f5207 + 99) % 128;
            }
        }

        public void didCompleteRewardedVideo(String str, int i) {
            f5208 = (f5207 + 3) % 128;
            C2680bk.this.m5464(this, this.f5212, m5584(View.getDefaultSize(0, 0) + 43, TextUtils.indexOf("", "", 0) + IronSourceError.ERROR_RV_SHOW_EXCEPTION, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).intern(), str, Integer.valueOf(i));
            ChartboostDelegate chartboostDelegate = this.f5213;
            if (chartboostDelegate != null) {
                chartboostDelegate.didCompleteRewardedVideo(str, i);
            }
            int i2 = f5208 + InterfaceC3173h3.d.b.f8823f;
            f5207 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 79 / 0;
            }
        }

        public void didDismissInterstitial(String str) {
            f5207 = (f5208 + 117) % 128;
            C2680bk.this.m5464(this, this.f5212, m5584((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 40, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 171, (char) (Process.myPid() >> 22)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f5213;
            if (chartboostDelegate != null) {
                int i = f5207 + 11;
                f5208 = i % 128;
                int i2 = i % 2;
                chartboostDelegate.didDismissInterstitial(str);
                if (i2 == 0) {
                    throw null;
                }
            }
        }

        public void didDismissMoreApps(String str) {
            f5208 = (f5207 + InterfaceC3173h3.d.b.f8823f) % 128;
            C2680bk.this.m5464(this, this.f5212, m5584(37 - ExpandableListView.getPackedPositionGroup(0L), ExpandableListView.getPackedPositionChild(0L) + 529, (char) (34980 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f5213;
            if (chartboostDelegate != null) {
                int i = f5208 + 19;
                f5207 = i % 128;
                int i2 = i % 2;
                chartboostDelegate.didDismissMoreApps(str);
                if (i2 != 0) {
                    throw null;
                }
            }
        }

        public void didDismissRewardedVideo(String str) {
            f5208 = (f5207 + 79) % 128;
            C2680bk.this.m5464(this, this.f5212, m5584(42 - (ViewConfiguration.getScrollBarSize() >> 8), 916 - Color.alpha(0), (char) (Process.myPid() >> 22)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f5213;
            if (chartboostDelegate != null) {
                int i = f5208 + 5;
                f5207 = i % 128;
                int i2 = i % 2;
                chartboostDelegate.didDismissRewardedVideo(str);
                if (i2 != 0) {
                    int i3 = 65 / 0;
                }
            }
        }

        public void didDisplayInterstitial(String str) {
            f5207 = (f5208 + 93) % 128;
            C2680bk.this.m5464(this, this.f5212, m5584(40 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 291 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 60416)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f5213;
            if (chartboostDelegate != null) {
                f5207 = (f5208 + 113) % 128;
                chartboostDelegate.didDisplayInterstitial(str);
            }
        }

        public void didDisplayMoreApps(String str) {
            f5208 = (f5207 + 63) % 128;
            C2680bk.this.m5464(this, this.f5212, m5584((ViewConfiguration.getKeyRepeatDelay() >> 16) + 37, (ViewConfiguration.getScrollBarSize() >> 8) + 635, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f5213;
            if (chartboostDelegate != null) {
                f5208 = (f5207 + 73) % 128;
                chartboostDelegate.didDisplayMoreApps(str);
            }
        }

        public void didDisplayRewardedVideo(String str) {
            f5208 = (f5207 + 33) % 128;
            C2680bk.this.m5464(this, this.f5212, m5584(42 - (ViewConfiguration.getLongPressTimeout() >> 16), KeyEvent.normalizeMetaState(0) + 1081, (char) View.getDefaultSize(0, 0)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f5213;
            if (chartboostDelegate != null) {
                chartboostDelegate.didDisplayRewardedVideo(str);
            }
            f5208 = (f5207 + 19) % 128;
        }

        public void didFailToLoadInPlay(String str, CBError.CBImpressionError cBImpressionError) {
            f5207 = (f5208 + 3) % 128;
            C2680bk.this.m5464(this, this.f5212, m5584(Color.red(0) + 38, View.getDefaultSize(0, 0) + 1191, (char) ExpandableListView.getPackedPositionType(0L)).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f5213;
            if (chartboostDelegate != null) {
                chartboostDelegate.didFailToLoadInPlay(str, cBImpressionError);
                f5207 = (f5208 + 77) % 128;
            }
        }

        public void didFailToLoadInterstitial(String str, CBError.CBImpressionError cBImpressionError) {
            f5207 = (f5208 + 125) % 128;
            C2680bk.this.m5464(this, this.f5212, m5584(44 - KeyEvent.normalizeMetaState(0), TextUtils.indexOf("", "", 0) + 127, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 63516)).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f5213;
            if (chartboostDelegate != null) {
                int i = f5207 + 47;
                f5208 = i % 128;
                int i2 = i % 2;
                chartboostDelegate.didFailToLoadInterstitial(str, cBImpressionError);
                if (i2 == 0) {
                    int i3 = 18 / 0;
                }
            }
        }

        public void didFailToLoadMoreApps(String str, CBError.CBImpressionError cBImpressionError) {
            C2680bk.this.m5464(this, this.f5212, m5584((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 39, 487 - TextUtils.indexOf((CharSequence) "", '0'), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f5213;
            if (chartboostDelegate != null) {
                int i = f5207 + 123;
                f5208 = i % 128;
                int i2 = i % 2;
                chartboostDelegate.didFailToLoadMoreApps(str, cBImpressionError);
                if (i2 == 0) {
                    throw null;
                }
            }
            f5207 = (f5208 + 95) % 128;
        }

        public void didFailToLoadRewardedVideo(String str, CBError.CBImpressionError cBImpressionError) {
            f5207 = (f5208 + 75) % 128;
            C2680bk.this.m5464(this, this.f5212, m5584((KeyEvent.getMaxKeyCode() >> 16) + 45, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 872, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1)).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f5213;
            if (chartboostDelegate != null) {
                f5207 = (f5208 + 9) % 128;
                chartboostDelegate.didFailToLoadRewardedVideo(str, cBImpressionError);
            }
            f5207 = (f5208 + 5) % 128;
        }

        public void didFailToRecordClick(String str, CBError.CBClickError cBClickError) {
            C2680bk.this.m5464(this, this.f5212, m5584(View.MeasureSpec.getSize(0) + 39, (ViewConfiguration.getTouchSlop() >> 8) + 672, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 40676)).intern(), str, cBClickError);
            ChartboostDelegate chartboostDelegate = this.f5213;
            if (chartboostDelegate != null) {
                int i = f5207 + 67;
                f5208 = i % 128;
                int i2 = i % 2;
                chartboostDelegate.didFailToRecordClick(str, cBClickError);
                if (i2 == 0) {
                    int i3 = 24 / 0;
                }
            }
            f5207 = (f5208 + 67) % 128;
        }

        public void didInitialize() {
            f5208 = (f5207 + 27) % 128;
            C2680bk.this.m5464(this, this.f5212, m5584(((byte) KeyEvent.getModifierMetaStateMask()) + 33, Color.alpha(0) + 1229, (char) (View.resolveSizeAndState(0, 0, 0) + 2382)).intern(), new Object[0]);
            ChartboostDelegate chartboostDelegate = this.f5213;
            if (chartboostDelegate != null) {
                chartboostDelegate.didInitialize();
                f5208 = (f5207 + 77) % 128;
            }
        }

        public void didPauseClickForConfirmation(Activity activity) {
            f5207 = (f5208 + 65) % 128;
            C2680bk.this.m5464(this, this.f5212, m5584(Color.green(0) + 47, View.MeasureSpec.getMode(0) + IronSourceError.ERROR_NT_INSTANCE_LOAD_EMPTY_ADAPTER, (char) View.combineMeasuredStates(0, 0)).intern(), activity);
            ChartboostDelegate chartboostDelegate = this.f5213;
            if (chartboostDelegate != null) {
                f5207 = (f5208 + 65) % 128;
                try {
                    chartboostDelegate.getClass().getDeclaredMethod(m5584(MotionEvent.axisFromString("") + 29, 757 - TextUtils.indexOf((CharSequence) "", '0'), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), Activity.class).invoke(this.f5213, activity);
                    return;
                } catch (Throwable unused) {
                }
            }
            int i = f5207 + 3;
            f5208 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public boolean shouldDisplayInterstitial(String str) {
            f5207 = (f5208 + 121) % 128;
            C2680bk.this.m5464(this, this.f5212, m5584(43 - TextUtils.lastIndexOf("", '0', 0), 44 - TextUtils.indexOf("", "", 0), (char) TextUtils.indexOf("", "", 0)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f5213;
            if (chartboostDelegate == null) {
                return false;
            }
            boolean zShouldDisplayInterstitial = chartboostDelegate.shouldDisplayInterstitial(str);
            int i = f5207 + InterfaceC3173h3.d.b.f8821d;
            f5208 = i % 128;
            if (i % 2 != 0) {
                return zShouldDisplayInterstitial;
            }
            throw null;
        }

        public boolean shouldDisplayMoreApps(String str) {
            f5207 = (f5208 + 15) % 128;
            C2680bk.this.m5464(this, this.f5212, m5584((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 39, 447 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (14794 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f5213;
            if (chartboostDelegate == null) {
                return false;
            }
            f5207 = (f5208 + InterfaceC3173h3.d.b.f8826i) % 128;
            return chartboostDelegate.shouldDisplayMoreApps(str);
        }

        public boolean shouldDisplayRewardedVideo(String str) {
            C2680bk.this.m5464(this, this.f5212, m5584(45 - View.MeasureSpec.getMode(0), Color.rgb(0, 0, 0) + 16778002, (char) (21790 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f5213;
            if (chartboostDelegate != null) {
                f5207 = (f5208 + 81) % 128;
                return chartboostDelegate.shouldDisplayRewardedVideo(str);
            }
            f5208 = (f5207 + 93) % 128;
            return false;
        }

        public boolean shouldRequestInterstitial(String str) {
            C2680bk.this.m5464(this, this.f5212, m5584(44 - (ViewConfiguration.getScrollDefaultDelay() >> 16), View.resolveSize(0, 0), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4859)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f5213;
            if (chartboostDelegate != null) {
                f5207 = (f5208 + 107) % 128;
                return chartboostDelegate.shouldRequestInterstitial(str);
            }
            int i = f5208 + 79;
            f5207 = i % 128;
            if (i % 2 == 0) {
                return false;
            }
            throw null;
        }

        public boolean shouldRequestMoreApps(String str) {
            f5207 = (f5208 + 63) % 128;
            C2680bk.this.m5464(this, this.f5212, m5584(41 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 373, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L))).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f5213;
            if (chartboostDelegate == null) {
                return false;
            }
            int i = f5207 + 61;
            f5208 = i % 128;
            if (i % 2 != 0) {
                return chartboostDelegate.shouldRequestMoreApps(str);
            }
            chartboostDelegate.shouldRequestMoreApps(str);
            throw null;
        }

        public void willDisplayVideo(String str) {
            f5208 = (f5207 + 61) % 128;
            C2680bk.this.m5464(this, this.f5212, m5584((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 35, 1124 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (Drawable.resolveOpacity(0, 0) + 60469)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f5213;
            if (chartboostDelegate != null) {
                chartboostDelegate.willDisplayVideo(str);
            }
            f5207 = (f5208 + InterfaceC3173h3.d.b.f8821d) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2838hg
        /* renamed from: ﻛ */
        public final /* synthetic */ ChartboostDelegate mo5387() {
            f5207 = (f5208 + 41) % 128;
            ChartboostDelegate chartboostDelegateM5583 = m5583();
            int i = f5208 + 19;
            f5207 = i % 128;
            if (i % 2 == 0) {
                return chartboostDelegateM5583;
            }
            throw null;
        }
    }

    public C2680bk(String str) {
        super(str);
    }

    /* renamed from: ﭖ */
    private static boolean m5563() {
        int i = f5194 + 13;
        f5196 = i % 128;
        if (i % 2 != 0) {
            return m5565() instanceof e;
        }
        int i2 = 81 / 0;
        return m5565() instanceof e;
    }

    /* renamed from: ﭴ */
    private static boolean m5564() {
        f5194 = (f5196 + 59) % 128;
        boolean zIsWebViewEnabled = Chartboost.isWebViewEnabled();
        int i = f5196 + 45;
        f5194 = i % 128;
        if (i % 2 != 0) {
            int i2 = 2 / 0;
        }
        return zIsWebViewEnabled;
    }

    /* renamed from: ﭸ */
    private static Object m5565() {
        int i = f5196 + 121;
        f5194 = i % 128;
        if (i % 2 != 0) {
            Chartboost.getDelegate();
            throw null;
        }
        a delegate = Chartboost.getDelegate();
        int i2 = f5196 + 47;
        f5194 = i2 % 128;
        if (i2 % 2 == 0) {
            return delegate;
        }
        throw null;
    }

    /* renamed from: ﮉ */
    private static Object m5566() {
        f5196 = (f5194 + 25) % 128;
        com.chartboost.sdk.impl.a aVar = g.d;
        f5194 = (f5196 + 123) % 128;
        return aVar;
    }

    /* renamed from: ﮌ */
    public static /* synthetic */ boolean m5567() {
        f5196 = (f5194 + 41) % 128;
        boolean zM5564 = m5564();
        f5194 = (f5196 + 77) % 128;
        return zM5564;
    }

    /* renamed from: ﮐ */
    public static /* synthetic */ Object m5568() {
        f5194 = (f5196 + 87) % 128;
        Object objM5565 = m5565();
        f5194 = (f5196 + 19) % 128;
        return objM5565;
    }

    /* renamed from: ﱡ */
    public static /* synthetic */ Object m5569() {
        int i = f5194 + 125;
        f5196 = i % 128;
        if (i % 2 != 0) {
            return m5566();
        }
        m5566();
        throw null;
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ String m5570(CBInPlay cBInPlay) {
        f5196 = (f5194 + 67) % 128;
        String strM5574 = m5574(cBInPlay);
        int i = f5194 + 13;
        f5196 = i % 128;
        if (i % 2 == 0) {
            int i2 = 97 / 0;
        }
        return strM5574;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ void m5575(ChartboostDelegate chartboostDelegate) {
        f5196 = (f5194 + 123) % 128;
        m5578(chartboostDelegate);
        int i = f5196 + 57;
        f5194 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ｋ */
    public static /* synthetic */ e m5576(C2680bk c2680bk, ChartboostDelegate chartboostDelegate, InterfaceC2704ch interfaceC2704ch) {
        f5194 = (f5196 + 45) % 128;
        e eVarM5573 = c2680bk.m5573(chartboostDelegate, interfaceC2704ch);
        int i = f5196 + 59;
        f5194 = i % 128;
        if (i % 2 != 0) {
            int i2 = 83 / 0;
        }
        return eVarM5573;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ String m5580(CBInPlay cBInPlay) {
        int i = f5194 + 33;
        f5196 = i % 128;
        if (i % 2 != 0) {
            return m5582(cBInPlay);
        }
        m5582(cBInPlay);
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﾒ */
    public final String mo5383() {
        int i = f5196 + 49;
        f5194 = i % 128;
        try {
            if (i % 2 == 0) {
                return Chartboost.getSDKVersion();
            }
            Chartboost.getSDKVersion();
            throw null;
        } catch (Error unused) {
            return m5581("馞鸛隣轑蟬", 1997 - AndroidCharacter.getMirror('0')).intern();
        }
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ boolean m5572(C2680bk c2680bk) {
        f5194 = (f5196 + InterfaceC3173h3.d.b.f8826i) % 128;
        boolean zM5563 = m5563();
        f5196 = (f5194 + 99) % 128;
        return zM5563;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ void m5579(C2680bk c2680bk, InterfaceC2704ch interfaceC2704ch) {
        int i = f5194 + 65;
        f5196 = i % 128;
        int i2 = i % 2;
        c2680bk.m5571(interfaceC2704ch);
        if (i2 == 0) {
            int i3 = 17 / 0;
        }
        int i4 = f5194 + 81;
        f5196 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 83 / 0;
        }
    }

    /* renamed from: ﾇ */
    private static String m5581(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2804g.f6422) {
            try {
                C2804g.f6423 = i;
                char[] cArr2 = new char[cArr.length];
                C2804g.f6421 = 0;
                while (true) {
                    int i2 = C2804g.f6421;
                    if (i2 < cArr.length) {
                        cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f5197);
                        C2804g.f6421++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﻛ */
    public final Map<String, AbstractC2676bg.b> mo5381() {
        HashMap map = new HashMap();
        map.put(m5581("駛쑘⋶腃\uef9e䨅ꢳᛗ略폲㸛鲻בּ", (ViewConfiguration.getTouchSlop() >> 8) + 23957).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.2
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2680bk.m5579(C2680bk.this, interfaceC2704ch);
                return null;
            }
        });
        map.put(m5577(Color.rgb(0, 0, 0) + 16777237, TextUtils.indexOf("", "", 0, 0) + 220, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1554)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.4
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2680bk.m5568();
            }
        });
        map.put(m5577((ViewConfiguration.getTouchSlop() >> 8) + 27, Color.argb(0, 0, 0, 0) + 241, (char) KeyEvent.getDeadChar(0, 0)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.5
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2680bk.m5569();
            }
        });
        map.put(m5577(ExpandableListView.getPackedPositionType(0L) + 26, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 268, (char) View.resolveSize(0, 0)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.3
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2680bk.m5576(C2680bk.this, (ChartboostDelegate) list.get(0), interfaceC2704ch);
            }
        });
        map.put(m5581("駛Ṭ隞༈蝄㿬된ⲻ꓂嵮햍䨰쉐竁\uf303殫\ue3dd顾ႛ褯ř", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 34721).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.1
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2680bk.m5575((ChartboostDelegate) list.get(0));
                return null;
            }
        });
        map.put(m5577(16 - ExpandableListView.getPackedPositionType(0L), 294 - Color.green(0), (char) Gravity.getAbsoluteGravity(0, 0)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.6
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return Boolean.valueOf(C2680bk.m5567());
            }
        });
        map.put(m5581("駏췺ㆲ敁줛㳘悃푝㡹氨폠", 21559 - ExpandableListView.getPackedPositionType(0L)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.10
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2680bk.m5570((CBInPlay) list.get(0));
            }
        });
        map.put(m5577(10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 310 - Color.green(0), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23922)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.9
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2680bk.m5580((CBInPlay) list.get(0));
            }
        });
        map.put(m5581("駁\ue970碪쯋孀ꪚ㷆赠Თ濊ｲ五", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28843).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.8
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return Boolean.valueOf(C2680bk.m5572(C2680bk.this));
            }
        });
        f5194 = (f5196 + 61) % 128;
        return map;
    }

    /* renamed from: ﻐ */
    private void m5571(InterfaceC2704ch interfaceC2704ch) {
        f5194 = (f5196 + 63) % 128;
        m5578(m5573((ChartboostDelegate) m5565(), interfaceC2704ch));
        int i = f5196 + 27;
        f5194 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0050  */
    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Class mo5382(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 980
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2680bk.mo5382(java.lang.String):java.lang.Class");
    }

    /* renamed from: ﾒ */
    private static String m5582(CBInPlay cBInPlay) {
        f5194 = (f5196 + 45) % 128;
        String appName = cBInPlay.getAppName();
        int i = f5196 + 93;
        f5194 = i % 128;
        if (i % 2 == 0) {
            return appName;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    private e m5573(ChartboostDelegate chartboostDelegate, InterfaceC2704ch interfaceC2704ch) {
        e eVar = new e(chartboostDelegate, interfaceC2704ch);
        int i = f5196 + 59;
        f5194 = i % 128;
        if (i % 2 == 0) {
            return eVar;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    private static String m5574(CBInPlay cBInPlay) {
        f5196 = (f5194 + 115) % 128;
        String location = cBInPlay.getLocation();
        f5196 = (f5194 + 117) % 128;
        return location;
    }

    /* renamed from: ｋ */
    private static void m5578(ChartboostDelegate chartboostDelegate) {
        f5194 = (f5196 + 47) % 128;
        Chartboost.setDelegate(chartboostDelegate);
        f5194 = (f5196 + 53) % 128;
    }

    /* renamed from: ｋ */
    private static String m5577(int i, int i2, char c) {
        String str;
        synchronized (C2642a.f4435) {
            try {
                char[] cArr = new char[i];
                C2642a.f4436 = 0;
                while (true) {
                    int i3 = C2642a.f4436;
                    if (i3 < i) {
                        cArr[i3] = (char) ((f5195[i2 + i3] ^ (i3 * f5193)) ^ c);
                        C2642a.f4436 = i3 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
