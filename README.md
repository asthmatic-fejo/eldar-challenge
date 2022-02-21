# eldar-challenge
Eldar challenge

La solucion parcial esta dockerizada y tiene la DB embebida H2, una app springboot de ms backend y una app angular.

Nota: La aplicacion solo permite hacer el drag and drop y guardar las invitaciones.

Pasos y requisitos para ejecutarla:
---------------
0. Tener instalado adecuadamente docker y docker-compose.
1. Sobre el root del proyecto ( al nivel de este Readme ), ejecutar:

1.1: docker-compose build
1.2: docker-compose up

2. Con la app levantada en cualquier navegador ir a: http://localhost:8484   (la app autoredirecciona /invitations al wrappear con un nginx si se recarga no funciona)
3. Los nombres de las personas estan precargados en un data.sql desde el backend, NO HARDCODE EN EL FRONT. Como no hice el alta, la manera de en todo caso reejecutarlo es bajar el docker-compose y volver a levantar :/
-------------

Aclaracion: En caso de querer checkear como queda la DB concretamente hay que levantar manualmente sin el compose ambos dockers porque hay un bug ajeno al desa para acceder a la consola H2.