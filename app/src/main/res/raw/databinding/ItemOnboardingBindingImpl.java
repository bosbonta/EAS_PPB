package raw.databinding;
import com.shopping.app.R;
import com.shopping.app.BR;
import com.shopping.app.databinding.ItemOnboardingBinding;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemOnboardingBindingImpl extends ItemOnboardingBinding {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemOnboardingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemOnboardingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.ivOnboarding.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvDescription.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.dataHolder == variableId) {
            setDataHolder((com.shopping.app.data.model.OnBoardModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDataHolder(@Nullable com.shopping.app.data.model.OnBoardModel DataHolder) {
        this.mDataHolder = DataHolder;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.dataHolder);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String contextGetStringDataHolderDescription = null;
        int dataHolderOnboardImage = 0;
        int dataHolderTitle = 0;
        com.shopping.app.data.model.OnBoardModel dataHolder = mDataHolder;
        java.lang.String contextGetStringDataHolderTitle = null;
        int dataHolderDescription = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (dataHolder != null) {
                    // read dataHolder.onboardImage
                    dataHolderOnboardImage = dataHolder.getOnboardImage();
                    // read dataHolder.title
                    dataHolderTitle = dataHolder.getTitle();
                    // read dataHolder.description
                    dataHolderDescription = dataHolder.getDescription();
                }


                // read context.getString(dataHolder.title)
                contextGetStringDataHolderTitle = getRoot().getContext().getString(dataHolderTitle);
                // read context.getString(dataHolder.description)
                contextGetStringDataHolderDescription = getRoot().getContext().getString(dataHolderDescription);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.ivOnboarding.setImageResource(dataHolderOnboardImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDescription, contextGetStringDataHolderDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, contextGetStringDataHolderTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): dataHolder
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}