package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.fragment.app.DialogFragment;
import com.github.superadb.R;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public final class o00O0O<S> extends DialogFragment {

    /* renamed from: OooOo */
    public int f27565OooOo;

    /* renamed from: OooOo0O */
    public final LinkedHashSet f27566OooOo0O;

    /* renamed from: OooOo0o */
    public final LinkedHashSet f27567OooOo0o;

    /* renamed from: OooOoO */
    public OooO0OO f27568OooOoO;

    /* renamed from: OooOoO0 */
    public o0Oo0oo f27569OooOoO0;

    /* renamed from: OooOoOO */
    public o000oOoO f27570OooOoOO;

    /* renamed from: OooOoo */
    public CharSequence f27571OooOoo;

    /* renamed from: OooOoo0 */
    public int f27572OooOoo0;

    /* renamed from: OooOooO */
    public boolean f27573OooOooO;

    /* renamed from: OooOooo */
    public int f27574OooOooo;

    /* renamed from: Oooo0 */
    public CharSequence f27575Oooo0;

    /* renamed from: Oooo000 */
    public int f27576Oooo000;

    /* renamed from: Oooo00O */
    public CharSequence f27577Oooo00O;

    /* renamed from: Oooo00o */
    public int f27578Oooo00o;

    /* renamed from: Oooo0O0 */
    public CheckableImageButton f27579Oooo0O0;

    /* renamed from: Oooo0OO */
    public o000000.OooOOO0 f27580Oooo0OO;

    /* renamed from: Oooo0o0 */
    public boolean f27581Oooo0o0;

    public o00O0O() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f27566OooOo0O = new LinkedHashSet();
        this.f27567OooOo0o = new LinkedHashSet();
    }

    public static int OooO0o(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        o00Ooo o00ooo2 = new o00Ooo(o000OOo.OooO0O0());
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding);
        int i = o00ooo2.f27584OooOo;
        return ((i - 1) * dimensionPixelOffset2) + (dimensionPixelSize * i) + (dimensionPixelOffset * 2);
    }

    public static boolean OooO0oO(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(oo0o0Oo.OooO0O0.OooO0OO(context, o000oOoO.class.getCanonicalName(), R.attr.materialCalendarStyle).data, new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    public final void OooO0o0() {
        if (getArguments().getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f27566OooOo0O.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f27565OooOo = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f27568OooOoO = (OooO0OO) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f27572OooOoo0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f27571OooOoo = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f27574OooOooo = bundle.getInt("INPUT_MODE_KEY");
        this.f27576Oooo000 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f27577Oooo00O = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f27578Oooo00o = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f27575Oooo0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Context contextRequireContext = requireContext();
        requireContext();
        int i = this.f27565OooOo;
        if (i == 0) {
            OooO0o0();
            throw null;
        }
        Dialog dialog = new Dialog(contextRequireContext, i);
        Context context = dialog.getContext();
        this.f27573OooOooO = OooO0oO(context, android.R.attr.windowFullscreen);
        int i2 = oo0o0Oo.OooO0O0.OooO0OO(context, o00O0O.class.getCanonicalName(), R.attr.colorSurface).data;
        o000000.OooOOO0 oooOOO0 = new o000000.OooOOO0(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        this.f27580Oooo0OO = oooOOO0;
        oooOOO0.OooOO0O(context);
        this.f27580Oooo0OO.OooOOO0(ColorStateList.valueOf(i2));
        this.f27580Oooo0OO.OooOO0o(ViewCompat.getElevation(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f27573OooOooO ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f27573OooOooO) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(OooO0o(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(OooO0o(context), -1));
        }
        ViewCompat.setAccessibilityLiveRegion((TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text), 1);
        this.f27579Oooo0O0 = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        CharSequence charSequence = this.f27571OooOoo;
        if (charSequence != null) {
            textView.setText(charSequence);
        } else {
            textView.setText(this.f27572OooOoo0);
        }
        this.f27579Oooo0O0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f27579Oooo0O0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, AppCompatResources.getDrawable(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AppCompatResources.getDrawable(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f27579Oooo0O0.setChecked(this.f27574OooOooo != 0);
        ViewCompat.setAccessibilityDelegate(this.f27579Oooo0O0, null);
        CheckableImageButton checkableImageButton2 = this.f27579Oooo0O0;
        this.f27579Oooo0O0.setContentDescription(checkableImageButton2.f27675OooOo0O ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f27579Oooo0O0.setOnClickListener(new OooOo(this, 1));
        OooO0o0();
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f27567OooOo0o.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f27565OooOo);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        OooO0OO oooO0OO = this.f27568OooOoO;
        OooO00o oooO00o = new OooO00o();
        int i = OooO00o.f27527OooO0O0;
        int i2 = OooO00o.f27527OooO0O0;
        long j = oooO0OO.start.f27587OooOoO;
        long j2 = oooO0OO.end.f27587OooOoO;
        oooO00o.f27528OooO00o = Long.valueOf(oooO0OO.openAt.f27587OooOoO);
        int i3 = oooO0OO.firstDayOfWeek;
        OooO0O0 oooO0O0 = oooO0OO.validator;
        o00Ooo o00ooo2 = this.f27570OooOoOO.f27559OooOoO0;
        if (o00ooo2 != null) {
            oooO00o.f27528OooO00o = Long.valueOf(o00ooo2.f27587OooOoO);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", oooO0O0);
        o00Ooo o00oooOooO0OO = o00Ooo.OooO0OO(j);
        o00Ooo o00oooOooO0OO2 = o00Ooo.OooO0OO(j2);
        OooO0O0 oooO0O02 = (OooO0O0) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = oooO00o.f27528OooO00o;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new OooO0OO(o00oooOooO0OO, o00oooOooO0OO2, oooO0O02, l != null ? o00Ooo.OooO0OO(l.longValue()) : null, i3));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f27572OooOoo0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f27571OooOoo);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f27576Oooo000);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f27577Oooo00O);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f27578Oooo00o);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f27575Oooo0);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() throws Resources.NotFoundException {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f27573OooOooO) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f27580Oooo0OO);
            if (!this.f27581Oooo0o0) {
                View viewFindViewById = requireView().findViewById(R.id.fullscreen_header);
                Integer numValueOf = viewFindViewById.getBackground() instanceof ColorDrawable ? Integer.valueOf(((ColorDrawable) viewFindViewById.getBackground()).getColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z = false;
                boolean z2 = numValueOf == null || numValueOf.intValue() == 0;
                int iOooOO0O = OooO00o.OooO00o.OooOO0O(window.getContext(), android.R.attr.colorBackground, ViewCompat.MEASURED_STATE_MASK);
                if (z2) {
                    numValueOf = Integer.valueOf(iOooOO0O);
                }
                WindowCompat.setDecorFitsSystemWindows(window, false);
                window.getContext();
                int alphaComponent = i < 27 ? ColorUtils.setAlphaComponent(OooO00o.OooO00o.OooOO0O(window.getContext(), android.R.attr.navigationBarColor, ViewCompat.MEASURED_STATE_MASK), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(alphaComponent);
                int iIntValue = numValueOf.intValue();
                WindowCompat.getInsetsController(window, window.getDecorView()).setAppearanceLightStatusBars(iIntValue != 0 && ColorUtils.calculateLuminance(iIntValue) > 0.5d);
                boolean z3 = iOooOO0O != 0 && ColorUtils.calculateLuminance(iOooOO0O) > 0.5d;
                if ((alphaComponent != 0 && ColorUtils.calculateLuminance(alphaComponent) > 0.5d) || (alphaComponent == 0 && z3)) {
                    z = true;
                }
                WindowCompat.getInsetsController(window, window.getDecorView()).setAppearanceLightNavigationBars(z);
                ViewCompat.setOnApplyWindowInsetsListener(viewFindViewById, new o0OoOo0(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingTop()));
                this.f27581Oooo0o0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f27580Oooo0OO, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new o00Ooo.OooOO0(requireDialog(), rect));
        }
        requireContext();
        int i2 = this.f27565OooOo;
        if (i2 == 0) {
            OooO0o0();
            throw null;
        }
        OooO0o0();
        OooO0OO oooO0OO = this.f27568OooOoO;
        o000oOoO o000oooo2 = new o000oOoO();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", oooO0OO);
        bundle.putParcelable("CURRENT_MONTH_KEY", oooO0OO.OooOO0O());
        o000oooo2.setArguments(bundle);
        this.f27570OooOoOO = o000oooo2;
        o0Oo0oo o0oo0oo = o000oooo2;
        if (this.f27579Oooo0O0.f27675OooOo0O) {
            OooO0o0();
            OooO0OO oooO0OO2 = this.f27568OooOoO;
            o0Oo0oo o00oo0 = new o00Oo0();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i2);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", oooO0OO2);
            o00oo0.setArguments(bundle2);
            o0oo0oo = o00oo0;
        }
        this.f27569OooOoO0 = o0oo0oo;
        OooO0o0();
        getContext();
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        this.f27569OooOoO0.f27594OooOo0O.clear();
        super.onStop();
    }
}
