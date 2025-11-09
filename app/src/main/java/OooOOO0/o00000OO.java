package OooooO0;

import OoooOoo.oOO0OoO0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.Nullable;
import androidx.annotation.PluralsRes;
import androidx.annotation.StringRes;
import androidx.annotation.XmlRes;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class o00000OO implements Parcelable {
    private static final int BADGE_NUMBER_NONE = -1;
    public static final Parcelable.Creator<o00000OO> CREATOR = new oOO0OoO0(1);
    private static final int NOT_SET = -2;

    @Dimension(unit = 1)
    private Integer additionalHorizontalOffset;

    @Dimension(unit = 1)
    private Integer additionalVerticalOffset;
    private int alpha;

    @ColorInt
    private Integer backgroundColor;
    private Integer badgeGravity;

    @XmlRes
    private int badgeResId;

    @ColorInt
    private Integer badgeTextColor;

    @StringRes
    private int contentDescriptionExceedsMaxBadgeNumberRes;

    @Nullable
    private CharSequence contentDescriptionNumberless;

    @PluralsRes
    private int contentDescriptionQuantityStrings;

    @Dimension(unit = 1)
    private Integer horizontalOffsetWithText;

    @Dimension(unit = 1)
    private Integer horizontalOffsetWithoutText;
    private Boolean isVisible;
    private int maxCharacterCount;
    private int number;
    private Locale numberLocale;

    @Dimension(unit = 1)
    private Integer verticalOffsetWithText;

    @Dimension(unit = 1)
    private Integer verticalOffsetWithoutText;

    public o00000OO() {
        this.alpha = 255;
        this.number = -2;
        this.maxCharacterCount = -2;
        this.isVisible = Boolean.TRUE;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.badgeResId);
        parcel.writeSerializable(this.backgroundColor);
        parcel.writeSerializable(this.badgeTextColor);
        parcel.writeInt(this.alpha);
        parcel.writeInt(this.number);
        parcel.writeInt(this.maxCharacterCount);
        CharSequence charSequence = this.contentDescriptionNumberless;
        parcel.writeString(charSequence == null ? null : charSequence.toString());
        parcel.writeInt(this.contentDescriptionQuantityStrings);
        parcel.writeSerializable(this.badgeGravity);
        parcel.writeSerializable(this.horizontalOffsetWithoutText);
        parcel.writeSerializable(this.verticalOffsetWithoutText);
        parcel.writeSerializable(this.horizontalOffsetWithText);
        parcel.writeSerializable(this.verticalOffsetWithText);
        parcel.writeSerializable(this.additionalHorizontalOffset);
        parcel.writeSerializable(this.additionalVerticalOffset);
        parcel.writeSerializable(this.isVisible);
        parcel.writeSerializable(this.numberLocale);
    }

    public o00000OO(Parcel parcel) {
        this.alpha = 255;
        this.number = -2;
        this.maxCharacterCount = -2;
        this.isVisible = Boolean.TRUE;
        this.badgeResId = parcel.readInt();
        this.backgroundColor = (Integer) parcel.readSerializable();
        this.badgeTextColor = (Integer) parcel.readSerializable();
        this.alpha = parcel.readInt();
        this.number = parcel.readInt();
        this.maxCharacterCount = parcel.readInt();
        this.contentDescriptionNumberless = parcel.readString();
        this.contentDescriptionQuantityStrings = parcel.readInt();
        this.badgeGravity = (Integer) parcel.readSerializable();
        this.horizontalOffsetWithoutText = (Integer) parcel.readSerializable();
        this.verticalOffsetWithoutText = (Integer) parcel.readSerializable();
        this.horizontalOffsetWithText = (Integer) parcel.readSerializable();
        this.verticalOffsetWithText = (Integer) parcel.readSerializable();
        this.additionalHorizontalOffset = (Integer) parcel.readSerializable();
        this.additionalVerticalOffset = (Integer) parcel.readSerializable();
        this.isVisible = (Boolean) parcel.readSerializable();
        this.numberLocale = (Locale) parcel.readSerializable();
    }
}
