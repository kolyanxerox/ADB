package OooooO0;

import Ooooo00.OooOo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.github.superadb.R;
import java.io.IOException;
import java.util.Locale;
import o0ooOO0.o00000O0;
import oo0o0Oo.OooO0OO;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public final class o0000Ooo {

    /* renamed from: OooO00o */
    public final o00000OO f15034OooO00o;

    /* renamed from: OooO0O0 */
    public final o00000OO f15035OooO0O0 = new o00000OO();

    /* renamed from: OooO0OO */
    public final float f15036OooO0OO;

    /* renamed from: OooO0Oo */
    public final float f15037OooO0Oo;

    /* renamed from: OooO0o0 */
    public final float f15038OooO0o0;

    public o0000Ooo(Context context, o00000OO o00000oo2) throws XmlPullParserException, Resources.NotFoundException, IOException {
        AttributeSet attributeSet;
        int styleAttribute;
        int next;
        o00000OO o00000oo3 = o00000oo2 == null ? new o00000OO() : o00000oo2;
        int i = o00000oo3.badgeResId;
        if (i != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                attributeSet = attributeSetAsAttributeSet;
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i));
                notFoundException.initCause(e);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayOooO0Oo = o00000O0.OooO0Oo(context, attributeSet, OooOo.f14953OooO0OO, R.attr.badgeStyle, styleAttribute == 0 ? R.style.Widget_MaterialComponents_Badge : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.f15036OooO0OO = typedArrayOooO0Oo.getDimensionPixelSize(2, resources.getDimensionPixelSize(R.dimen.mtrl_badge_radius));
        this.f15038OooO0o0 = typedArrayOooO0Oo.getDimensionPixelSize(4, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding));
        this.f15037OooO0Oo = typedArrayOooO0Oo.getDimensionPixelSize(5, resources.getDimensionPixelSize(R.dimen.mtrl_badge_with_text_radius));
        this.f15035OooO0O0.alpha = o00000oo3.alpha == -2 ? 255 : o00000oo3.alpha;
        this.f15035OooO0O0.contentDescriptionNumberless = o00000oo3.contentDescriptionNumberless == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : o00000oo3.contentDescriptionNumberless;
        this.f15035OooO0O0.contentDescriptionQuantityStrings = o00000oo3.contentDescriptionQuantityStrings == 0 ? R.plurals.mtrl_badge_content_description : o00000oo3.contentDescriptionQuantityStrings;
        this.f15035OooO0O0.contentDescriptionExceedsMaxBadgeNumberRes = o00000oo3.contentDescriptionExceedsMaxBadgeNumberRes == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : o00000oo3.contentDescriptionExceedsMaxBadgeNumberRes;
        this.f15035OooO0O0.isVisible = Boolean.valueOf(o00000oo3.isVisible == null || o00000oo3.isVisible.booleanValue());
        this.f15035OooO0O0.maxCharacterCount = o00000oo3.maxCharacterCount == -2 ? typedArrayOooO0Oo.getInt(8, 4) : o00000oo3.maxCharacterCount;
        if (o00000oo3.number != -2) {
            this.f15035OooO0O0.number = o00000oo3.number;
        } else if (typedArrayOooO0Oo.hasValue(9)) {
            this.f15035OooO0O0.number = typedArrayOooO0Oo.getInt(9, 0);
        } else {
            this.f15035OooO0O0.number = -1;
        }
        this.f15035OooO0O0.backgroundColor = Integer.valueOf(o00000oo3.backgroundColor == null ? OooO0OO.OooO00o(context, typedArrayOooO0Oo, 0).getDefaultColor() : o00000oo3.backgroundColor.intValue());
        if (o00000oo3.badgeTextColor != null) {
            this.f15035OooO0O0.badgeTextColor = o00000oo3.badgeTextColor;
        } else if (typedArrayOooO0Oo.hasValue(3)) {
            this.f15035OooO0O0.badgeTextColor = Integer.valueOf(OooO0OO.OooO00o(context, typedArrayOooO0Oo, 3).getDefaultColor());
        } else {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.TextAppearance_MaterialComponents_Badge, OooOo.f14999OoooOoo);
            typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList colorStateListOooO00o = OooO0OO.OooO00o(context, typedArrayObtainStyledAttributes, 3);
            OooO0OO.OooO00o(context, typedArrayObtainStyledAttributes, 4);
            OooO0OO.OooO00o(context, typedArrayObtainStyledAttributes, 5);
            typedArrayObtainStyledAttributes.getInt(2, 0);
            typedArrayObtainStyledAttributes.getInt(1, 1);
            int i2 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
            typedArrayObtainStyledAttributes.getResourceId(i2, 0);
            typedArrayObtainStyledAttributes.getString(i2);
            typedArrayObtainStyledAttributes.getBoolean(14, false);
            OooO0OO.OooO00o(context, typedArrayObtainStyledAttributes, 6);
            typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(R.style.TextAppearance_MaterialComponents_Badge, OooOo.f14980Oooo0);
            typedArrayObtainStyledAttributes2.hasValue(0);
            typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes2.recycle();
            this.f15035OooO0O0.badgeTextColor = Integer.valueOf(colorStateListOooO00o.getDefaultColor());
        }
        this.f15035OooO0O0.badgeGravity = Integer.valueOf(o00000oo3.badgeGravity == null ? typedArrayOooO0Oo.getInt(1, 8388661) : o00000oo3.badgeGravity.intValue());
        this.f15035OooO0O0.horizontalOffsetWithoutText = Integer.valueOf(o00000oo3.horizontalOffsetWithoutText == null ? typedArrayOooO0Oo.getDimensionPixelOffset(6, 0) : o00000oo3.horizontalOffsetWithoutText.intValue());
        this.f15035OooO0O0.verticalOffsetWithoutText = Integer.valueOf(o00000oo3.verticalOffsetWithoutText == null ? typedArrayOooO0Oo.getDimensionPixelOffset(10, 0) : o00000oo3.verticalOffsetWithoutText.intValue());
        this.f15035OooO0O0.horizontalOffsetWithText = Integer.valueOf(o00000oo3.horizontalOffsetWithText == null ? typedArrayOooO0Oo.getDimensionPixelOffset(7, this.f15035OooO0O0.horizontalOffsetWithoutText.intValue()) : o00000oo3.horizontalOffsetWithText.intValue());
        this.f15035OooO0O0.verticalOffsetWithText = Integer.valueOf(o00000oo3.verticalOffsetWithText == null ? typedArrayOooO0Oo.getDimensionPixelOffset(11, this.f15035OooO0O0.verticalOffsetWithoutText.intValue()) : o00000oo3.verticalOffsetWithText.intValue());
        this.f15035OooO0O0.additionalHorizontalOffset = Integer.valueOf(o00000oo3.additionalHorizontalOffset == null ? 0 : o00000oo3.additionalHorizontalOffset.intValue());
        this.f15035OooO0O0.additionalVerticalOffset = Integer.valueOf(o00000oo3.additionalVerticalOffset != null ? o00000oo3.additionalVerticalOffset.intValue() : 0);
        typedArrayOooO0Oo.recycle();
        if (o00000oo3.numberLocale == null) {
            this.f15035OooO0O0.numberLocale = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.f15035OooO0O0.numberLocale = o00000oo3.numberLocale;
        }
        this.f15034OooO00o = o00000oo3;
    }
}
