import { NgModule } from '@angular/core';

// Form Controls
import { NzButtonModule } from 'ng-zorro-antd/button';
import { NzCheckboxModule } from 'ng-zorro-antd/checkbox';
import { NzDatePickerModule } from 'ng-zorro-antd/date-picker';
import { NzFormModule } from 'ng-zorro-antd/form';
import { NzInputModule } from 'ng-zorro-antd/input';
import { NzInputNumberModule } from 'ng-zorro-antd/input-number';
import { NzRadioModule } from 'ng-zorro-antd/radio';
import { NzRateModule } from 'ng-zorro-antd/rate';
import { NzSelectModule } from 'ng-zorro-antd/select';
import { NzSliderModule } from 'ng-zorro-antd/slider';
import { NzSwitchModule } from 'ng-zorro-antd/switch';
import { NzTimePickerModule } from 'ng-zorro-antd/time-picker';
import { NzUploadModule } from 'ng-zorro-antd/upload';

// Data Display
import { NzAvatarModule } from 'ng-zorro-antd/avatar';
import { NzBadgeModule } from 'ng-zorro-antd/badge';
import { NzCalendarModule } from 'ng-zorro-antd/calendar';
import { NzCardModule } from 'ng-zorro-antd/card';
import { NzDescriptionsModule } from 'ng-zorro-antd/descriptions';
import { NzEmptyModule } from 'ng-zorro-antd/empty';
import { NzImageModule } from 'ng-zorro-antd/image';
import { NzListModule } from 'ng-zorro-antd/list';
import { NzStatisticModule } from 'ng-zorro-antd/statistic';
import { NzTableModule } from 'ng-zorro-antd/table';
import { NzTagModule } from 'ng-zorro-antd/tag';

// Feedback
import { NzAlertModule } from 'ng-zorro-antd/alert';
import { NzDrawerModule } from 'ng-zorro-antd/drawer';
import { NzModalModule } from 'ng-zorro-antd/modal';
import { NzPopconfirmModule } from 'ng-zorro-antd/popconfirm';
import { NzProgressModule } from 'ng-zorro-antd/progress';
import { NzResultModule } from 'ng-zorro-antd/result';
import { NzSkeletonModule } from 'ng-zorro-antd/skeleton';
import { NzSpinModule } from 'ng-zorro-antd/spin';

// Navigation
import { NzBreadCrumbModule } from 'ng-zorro-antd/breadcrumb';
import { NzDropDownModule } from 'ng-zorro-antd/dropdown';
import { NzMenuModule } from 'ng-zorro-antd/menu';
import { NzPaginationModule } from 'ng-zorro-antd/pagination';
import { NzStepsModule } from 'ng-zorro-antd/steps';
import { NzTabsModule } from 'ng-zorro-antd/tabs';

// Layout
import { NzDividerModule } from 'ng-zorro-antd/divider';
import { NzGridModule } from 'ng-zorro-antd/grid';
import { NzLayoutModule } from 'ng-zorro-antd/layout';
import { NzSpaceModule } from 'ng-zorro-antd/space';

// Charts and Data Visualization (especially useful for fitness tracking)
import { NzGraphModule } from 'ng-zorro-antd/graph';

// Other
import { NzAffixModule } from 'ng-zorro-antd/affix';
import { NzAnchorModule } from 'ng-zorro-antd/anchor';
import { NzAutocompleteModule } from 'ng-zorro-antd/auto-complete'; 
import { NzBackTopModule } from 'ng-zorro-antd/back-top';
import { NzCascaderModule } from 'ng-zorro-antd/cascader';
import { NzCollapseModule } from 'ng-zorro-antd/collapse';
import { NzCarouselModule } from 'ng-zorro-antd/carousel';
import { NzCommentModule } from 'ng-zorro-antd/comment';
import { NzIconModule } from 'ng-zorro-antd/icon';
import { NzI18nModule } from 'ng-zorro-antd/i18n';
import { NzMentionModule } from 'ng-zorro-antd/mention';
import { NzNoAnimationModule } from 'ng-zorro-antd/core/no-animation';
import { NzPageHeaderModule } from 'ng-zorro-antd/page-header';
import { NzPipesModule } from 'ng-zorro-antd/pipes';
import { NzPopoverModule } from 'ng-zorro-antd/popover';
import { NzQRCodeModule } from 'ng-zorro-antd/qr-code';
import { NzResizableModule } from 'ng-zorro-antd/resizable';
import { NzTimelineModule } from 'ng-zorro-antd/timeline';
import { NzToolTipModule } from 'ng-zorro-antd/tooltip';
import { NzTransButtonModule } from 'ng-zorro-antd/core/trans-button';
import { NzTransferModule } from 'ng-zorro-antd/transfer';
import { NzTreeModule } from 'ng-zorro-antd/tree';
import { NzTreeSelectModule } from 'ng-zorro-antd/tree-select';
import { NzTreeViewModule } from 'ng-zorro-antd/tree-view';
import { NzTypographyModule } from 'ng-zorro-antd/typography';
import { NzWaterMarkModule } from 'ng-zorro-antd/water-mark';
import { NzWaveModule } from 'ng-zorro-antd/core/wave';
import * as AllIcons from '@ant-design/icons-angular/icons';

const antDesignIcons = Object.values(AllIcons);

@NgModule({
  imports: [
    NzIconModule.forChild(antDesignIcons),
  ],
  exports: [
    // Form Controls
    NzButtonModule,
    NzCheckboxModule,
    NzDatePickerModule,
    NzFormModule,
    NzInputModule,
    NzInputNumberModule,
    NzRadioModule,
    NzRateModule,
    NzSelectModule,
    NzSliderModule,
    NzSwitchModule,
    NzTimePickerModule,
    NzUploadModule,
    
    // Data Display
    NzAvatarModule,
    NzBadgeModule,
    NzCalendarModule,
    NzCardModule,
    NzDescriptionsModule,
    NzEmptyModule,
    NzImageModule,
    NzListModule,
    NzStatisticModule,
    NzTableModule,
    NzTagModule,
    
    // Feedback
    NzAlertModule,
    NzDrawerModule,
    NzModalModule,
    NzPopconfirmModule,
    NzProgressModule,
    NzResultModule,
    NzSkeletonModule,
    NzSpinModule,
    
    // Navigation
    NzBreadCrumbModule,
    NzDropDownModule,
    NzMenuModule,
    NzPaginationModule,
    NzStepsModule,
    NzTabsModule,
    
    // Layout
    NzDividerModule,
    NzGridModule,
    NzLayoutModule,
    NzSpaceModule,
    
    // Charts and Data Visualization
    NzGraphModule,
    
    // Other
    NzAffixModule,
    NzAnchorModule,
    NzAutocompleteModule,
    NzBackTopModule,
    NzCascaderModule,
    NzCarouselModule,
    NzCommentModule,
    NzCollapseModule,
    NzIconModule,
    NzI18nModule,
    NzMentionModule,
    NzNoAnimationModule,
    NzPageHeaderModule,
    NzPipesModule,
    NzPopoverModule,
    NzQRCodeModule,
    NzResizableModule,
    NzTimelineModule,
    NzToolTipModule,
    NzTransferModule,
    NzTransButtonModule,
    NzTreeModule,
    NzTreeSelectModule,
    NzTreeViewModule,
    NzTypographyModule,
    NzWaterMarkModule,
    NzWaveModule,
  ]
})
export class DemoNgZorroAntdModule { } 