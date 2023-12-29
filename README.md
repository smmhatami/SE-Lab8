# گزارش آزمایش هشتم درس مهندسی نرم افزار

## اعضای گروه

+ سید محمدمهدی حاتمی 98109561
+ پیمان حاجی محمد 98170776

## شرح آزمایش 

### گام صفر : مقدمات 

ابتدا مانند آزمایش های قبلی مخزن گیت را راه اندازی کرده و تنظیمات حفاظت از main را روی آن اعمال می کنیم. سپس پروژه ی ProfilingTest را به آن اضافه می کنیم. همچنین ابزار yourkit را نصب کرده و فرایند اتصال آن به intellij را انجام می دهیم. 

### گام یک :‌ 
مطابق دستورالعمل آزمایش profiling را روی کلاس javaCup اجرا می کنیم. مطابق تصویر زیر ورودی های برنامه را داده و منتظر تکمیل آنالیز می مانیم. 

![Screenshot from 2023-12-29 14-49-46](https://github.com/smmhatami/SE-Lab8/assets/62210297/1c4a4a3b-ee03-47d8-9822-6cd85a9f7f15)

پس از اجرا مشاهده می کنیم که از نظر Memory و CPU تابعی که بیشتری مصرف را دارد، تابع temp است. 

![Screenshot from 2023-12-29 14-45-55](https://github.com/smmhatami/SE-Lab8/assets/62210297/bf9771bb-594d-4942-a94b-0488d9c1ce54)
![Screenshot from 2023-12-29 14-46-07](https://github.com/smmhatami/SE-Lab8/assets/62210297/d3f033e6-9e95-4958-9209-58beb35319f5)

حال به بررسی تابع مورد نظر می پردازیم. 

![Screenshot from 2023-12-29 15-32-24](https://github.com/smmhatami/SE-Lab8/assets/62210297/9e12f670-ad99-4092-8872-44782b6def28)

این تابع یک آرایه ساخته و تمام i + j ها را به آن اضافه می کند. با بررسی برنامه مشاهده می کنیم که این تابع خروجی خاصی ندارد و در روند اجرای برنامه هم اثری ندارد. در نتیجه می توانیم این تابع را از برنامه حذف می کنیم. سپس برنامه را مجددا اجرا می کنیم و مشاهده می کنیم که بدون مشکل اجرا می شود و مصرف منابع آن نیز بهینه شده است. 

![Screenshot from 2023-12-29 15-38-07](https://github.com/smmhatami/SE-Lab8/assets/62210297/b76eae6f-5e17-457f-bcb7-b1c35350a649)

![Screenshot from 2023-12-29 15-39-03](https://github.com/smmhatami/SE-Lab8/assets/62210297/5fdbf71e-574e-4c20-9200-720ca431aa69)

